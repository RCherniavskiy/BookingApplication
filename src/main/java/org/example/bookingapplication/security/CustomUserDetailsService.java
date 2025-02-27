package org.example.bookingapplication.security;

import lombok.RequiredArgsConstructor;
import org.example.bookingapplication.repository.user.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findUserByEmailWithRoles(email).orElseThrow(
                () -> new UsernameNotFoundException("Cant find user with email: " + email));
    }
}

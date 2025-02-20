package org.example.bookingapplication.config;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {
    @Value("${stripe.key}")
    private String secretKey;

    @Value("${stripe.success.url}")
    private String successUrl;

    @Value("${stripe.cancel.url}")
    private String cancelUrl;

    @Bean
    public String successUrl() {
        return successUrl;
    }

    @Bean
    public String cancelUrl() {
        return cancelUrl;
    }

    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }
}

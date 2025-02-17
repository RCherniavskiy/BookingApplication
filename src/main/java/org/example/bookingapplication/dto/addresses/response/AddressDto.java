package org.example.bookingapplication.dto.addresses.response;

import lombok.Data;

@Data
public class AddressDto {
    private String country;
    private String state;
    private String city;
    private String district;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String floor;
    private String zipCode;
}

package com.muathejamil.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}

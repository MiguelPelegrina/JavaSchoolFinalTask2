package com.javaSchool.FinalTask3.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String email;
    private boolean isActive;
    private String phoneNumber;
    // TODO Not sure if right
    private UserAddressDTO address;
}

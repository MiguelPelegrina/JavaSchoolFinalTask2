package com.javaSchool.FinalTask3.domain.user.userAddress.postalCode.city;

import lombok.Data;

/**
 * Data Transfer Object (DTO) of {@link CityEntity}.
 */
@Data
public class CityDTO {
    private String name;
    private boolean isActive;
    private String countryName;
}

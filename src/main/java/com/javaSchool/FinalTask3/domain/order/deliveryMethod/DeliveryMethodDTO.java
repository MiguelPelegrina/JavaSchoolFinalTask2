package com.javaSchool.FinalTask3.domain.order.deliveryMethod;

import lombok.Data;

/**
 * Data Transfer Object (DTO) of {@link DeliveryMethodEntity}.
 */
@Data
public class DeliveryMethodDTO {
    private String name;
    private boolean isActive;
}

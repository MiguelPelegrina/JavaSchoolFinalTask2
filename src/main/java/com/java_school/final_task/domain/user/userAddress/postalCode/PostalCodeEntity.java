package com.java_school.final_task.domain.user.userAddress.postalCode;

import com.java_school.final_task.domain.user.userAddress.postalCode.city.CityEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@Entity
@RequiredArgsConstructor
@Table(name = "postal_codes", schema = "public", catalog = "online_store")
public class PostalCodeEntity {
    // TODO Should maybe have either an composite key with city or an unique id
    @Id
    @Column(name = "code", length = 45)
    private String code;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_name", referencedColumnName = "name", nullable = false)
    private CityEntity city;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}
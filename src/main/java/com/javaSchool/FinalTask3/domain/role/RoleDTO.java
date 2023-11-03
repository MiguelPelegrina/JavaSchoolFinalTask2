package com.javaSchool.FinalTask3.domain.role;

import com.javaSchool.FinalTask3.domain.userRole.UserRoleEntity;
import lombok.Data;

import java.util.Set;

/**
 * Data Transfer Object (DTO) of {@link RoleEntity}.
 */
@Data
public class RoleDTO {
    private String name;
    private Set<UserRoleEntity> roles;
}

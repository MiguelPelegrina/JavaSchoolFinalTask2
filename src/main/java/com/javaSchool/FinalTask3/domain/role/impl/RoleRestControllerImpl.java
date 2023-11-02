package com.javaSchool.FinalTask3.domain.role.impl;

import com.javaSchool.FinalTask3.domain.role.RoleDTO;
import com.javaSchool.FinalTask3.domain.role.RoleEntity;
import com.javaSchool.FinalTask3.domain.role.RoleRepository;
import com.javaSchool.FinalTask3.utils.impl.AbstractRestControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController of the {@link RoleEntity} entity. Handles the REST methods. Uses
 * {@link RoleDTO} as returning object.
 */
@RequestMapping(path = "roles")
@RestController
public class RoleRestControllerImpl
        extends AbstractRestControllerImpl<RoleServiceImpl, RoleRepository, RoleEntity, RoleDTO, String> {
    /**
     * All arguments constructor.
     * @param service {@link RoleServiceImpl} of the {@link RoleEntity} entity.
     */
    public RoleRestControllerImpl(RoleServiceImpl service) {
        super(service);
    }
}

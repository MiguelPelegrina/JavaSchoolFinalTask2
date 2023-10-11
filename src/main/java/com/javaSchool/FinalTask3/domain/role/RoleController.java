package com.javaSchool.FinalTask3.domain.role;

import com.javaSchool.FinalTask3.utils.AbstractRestControllerWithUpdate;
import com.javaSchool.FinalTask3.utils.AbstractServiceWithUpdate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController of the {@link RoleEntity} entity. Handles the REST methods. Uses
 * {@link RoleDTO} as returning object.
 */
@RequestMapping("roles")
@RestController
public class RoleController extends AbstractRestControllerWithUpdate<RoleEntity, RoleDTO, String> {
    /**
     * All arguments constructor.
     * @param service {@link RoleService} of the {@link RoleEntity} entity.
     */
    public RoleController(AbstractServiceWithUpdate<RoleEntity, RoleDTO, String> service) {
        super(service);
    }
}

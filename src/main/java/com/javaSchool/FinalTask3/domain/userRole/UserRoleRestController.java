package com.javaSchool.FinalTask3.domain.userRole;

import com.javaSchool.FinalTask3.domain.userAddress.UserAddressDTO;
import com.javaSchool.FinalTask3.domain.userAddress.UserAddressEntity;
import com.javaSchool.FinalTask3.utils.AbstractRestController;
import com.javaSchool.FinalTask3.utils.AbstractService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController of the {@link UserAddressEntity} entity. Handles the REST methods. Uses
 * {@link UserAddressDTO} as returning object.
 */
@RequestMapping(path = "userroles", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class UserRoleRestController extends AbstractRestController<UserRoleEntity, UserRoleDTO, Integer> {
    /**
     * All arguments constructor.
     * @param service {@link UserRoleService} of the {@link UserRoleEntity} entity.
     */
    public UserRoleRestController(AbstractService<UserRoleEntity, UserRoleDTO, Integer> service) {
        super(service);
    }
}

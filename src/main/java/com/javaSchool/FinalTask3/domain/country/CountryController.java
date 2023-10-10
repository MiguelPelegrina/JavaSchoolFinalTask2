package com.javaSchool.FinalTask3.domain.country;

import com.javaSchool.FinalTask3.utils.AbstractServiceWithUpdate;
import com.javaSchool.FinalTask3.utils.AbstractControllerWithUpdate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController of the {@link CountryEntity} entity. Handles the REST methods. Uses {@link CountryDTO} as returning object.
 */
@RequestMapping(path = "countries")
@RestController
public class CountryController extends AbstractControllerWithUpdate<CountryEntity, CountryDTO, String> {
    /**
     * All arguments constructor.
     * @param service {@link CountryService} of the {@link CountryEntity} entity.
     */
    public CountryController(AbstractServiceWithUpdate<CountryEntity, CountryDTO, String> service) {
        super(service);
    }
}

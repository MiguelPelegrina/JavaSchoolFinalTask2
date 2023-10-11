package com.javaSchool.FinalTask3.domain.bookParameter;

import com.javaSchool.FinalTask3.utils.AbstractRestControllerWithUpdate;
import com.javaSchool.FinalTask3.utils.AbstractServiceWithUpdate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * RestController of the {@link BookParameterEntity} entity. Handles the REST methods. Uses {@link BookParameterDTO} as
 * returning object.
 */
@RequestMapping("bookparameters")
@RestController
public class BookParameterRestController extends AbstractRestControllerWithUpdate<BookParameterEntity, BookParameterDTO, Integer> {
    /**
     * All arguments constructor.
     * @param service {@link BookParameterService} of the {@link BookParameterEntity} entity.
     */
    public BookParameterRestController(AbstractServiceWithUpdate<BookParameterEntity, BookParameterDTO, Integer> service) {
        super(service);
    }
}

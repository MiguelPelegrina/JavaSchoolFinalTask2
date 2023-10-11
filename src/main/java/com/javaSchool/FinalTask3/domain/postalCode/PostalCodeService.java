package com.javaSchool.FinalTask3.domain.postalCode;

import com.javaSchool.FinalTask3.utils.AbstractServiceWithUpdate;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class responsible for the interaction between the {@link PostalCodeRepository} and the {@link PostalCodeRestController}.
 * Obtains data from the  {@link PostalCodeRepository} and returns the object(s) of the entity {@link PostalCodeEntity} as
 * {@link PostalCodeDTO} to the {@link PostalCodeRestController}.
 */
@Service
@Transactional(readOnly = true)
public class PostalCodeService extends AbstractServiceWithUpdate<PostalCodeEntity, PostalCodeDTO, String> {
    /**
     * All arguments constructor.
     * @param repository {@link PostalCodeRepository} of the {@link PostalCodeEntity}.
     * @param modelMapper ModelMapper that converts the {@link PostalCodeEntity} to {@link PostalCodeDTO}
     */
    public PostalCodeService(PostalCodeRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    /**
     * Returns the DTO class of the {@link PostalCodeEntity}.
     * @return Returns the {@link PostalCodeDTO} class.
     */
    @Override
    protected Class<PostalCodeDTO> getDTOClass() {
        return PostalCodeDTO.class;
    }

    @Override
    protected String getEntityId(PostalCodeEntity instance) {
        return instance.getCode();
    }

    /**
     * Updates the values of an existing {@link PostalCodeEntity} instance with new ones.
     * @param existingInstance Instance that already exists in the database.
     * @param newInstance Instance that stores the value to update the existing instance.
     */
    @Override
    protected void updateValues(PostalCodeEntity existingInstance, PostalCodeEntity newInstance) {
        existingInstance.setActive(newInstance.isActive());
        existingInstance.setCity(newInstance.getCity());
    }
}
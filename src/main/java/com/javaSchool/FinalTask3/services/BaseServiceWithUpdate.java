package com.javaSchool.FinalTask3.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Parent service that inherits from {@link BaseService}. Adds the necessary methods to update an instance of an entity
 * in the database. Used for entities that have more than one attribute and therefore can be updated.
 */
@AllArgsConstructor
@Service
@Transactional(readOnly = true)
public abstract class BaseServiceWithUpdate<Entity, EntityDTO, EntityID> extends BaseService<Entity, EntityDTO, EntityID> {
    /**
     * Handles the PUT request. Updates an existing instance of the entity in the database.
     * @param id ID of the instance that will be updated.
     * @param item Instance that will be updated in the database.
     * @return Returns the updated instance. If the instance could not be updated, it returns null.
     */
    @Transactional
    public EntityDTO updateItem(EntityID id, Entity item){
        return repository.findById(id).map(existingItem -> {
            updateExistingItem(existingItem, item);
            return modelMapper.map(repository.save(existingItem), getDTOClass());
        }).orElse(null);
    }

    /**
     * Abstract method to be implemented by subclasses to update existing item properties
     * @param existingItem Instance that already exists in the database.
     * @param newItem Instance that stores the value to update the existing instance.
     */
    protected abstract void updateExistingItem(Entity existingItem, Entity newItem);
}

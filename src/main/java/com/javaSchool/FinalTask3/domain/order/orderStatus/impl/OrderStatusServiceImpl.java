package com.javaSchool.FinalTask3.domain.order.orderStatus.impl;

import com.javaSchool.FinalTask3.domain.order.orderStatus.OrderStatusDTO;
import com.javaSchool.FinalTask3.domain.order.orderStatus.OrderStatusEntity;
import com.javaSchool.FinalTask3.domain.order.orderStatus.OrderStatusRepository;
import com.javaSchool.FinalTask3.utils.impl.AbstractServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class responsible for the interaction between the {@link OrderStatusRepository} and the
 * {@link OrderStatusRestControllerImpl}. Obtains data from the {@link OrderStatusRepository}
 * and returns the object(s) of the entity {@link OrderStatusEntity} as {@link OrderStatusDTO} to the
 * {@link OrderStatusRestControllerImpl}.
 */
@Service
@Transactional(readOnly = true)
public class OrderStatusServiceImpl
        extends AbstractServiceImpl<OrderStatusRepository, OrderStatusEntity, OrderStatusDTO, String> {
    /**
     * All arguments constructor.
     * @param repository {@link OrderStatusRepository} of the {@link OrderStatusEntity} entity.
     * @param modelMapper ModelMapper that converts the {@link OrderStatusEntity} to {@link OrderStatusDTO}
     */
    public OrderStatusServiceImpl(OrderStatusRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    @Override
    public Class<OrderStatusDTO> getDTOClass() {
        return OrderStatusDTO.class;
    }

    @Override
    public String getEntityId(OrderStatusEntity instance) {
        return instance.getName();
    }
}
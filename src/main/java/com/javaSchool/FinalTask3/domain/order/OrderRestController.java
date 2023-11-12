package com.javaSchool.FinalTask3.domain.order;

import com.javaSchool.FinalTask3.domain.order.dto.OrderDTO;
import com.javaSchool.FinalTask3.domain.order.dto.SaveOrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * RestController interface of the {@link OrderEntity} entity. Handles the REST methods. Uses {@link OrderDTO} as returning object.
 */
public interface OrderRestController {
    /**
     * Retrieves a page of {@link OrderDTO}s from the database based on specified parameters and sorting criteria.
     * @param orderRequest  {@link OrderRequest} that contains all the specified parameters and sorting criteria.
     * @return              ResponseEntity containing a Page of {@link OrderDTO}}s based on the specified criteria.
     */
    ResponseEntity<Page<OrderDTO>> getAllInstances(OrderRequest orderRequest);

    /**
     * Endpoint for calculating revenue within a specified date range.
     * @param startDate The start date of the period for which to calculate revenue.
     * @param endDate   The end date of the period for which to calculate revenue.
     * @return {@code ResponseEntity} containing a {@code BigDecimal} representing the calculated revenue.
     */
    ResponseEntity<BigDecimal> calculateTotalRevenue(LocalDate startDate, LocalDate endDate);

    /**
     * Submits a POST request with a {@link SaveOrderDTO} to create an order instance in the database.
     * @param saveOrderDTO Instance to create.
     * @return Returns a ResponseEntity with the {@link OrderDTO} and the status of the POST request.
     * If successful, the code is 200 created successfully, 204 otherwise.
     */
    ResponseEntity<OrderDTO> saveInstance(SaveOrderDTO saveOrderDTO);
}

package com.javaSchool.FinalTask3.domain.order.paymentMethod.impl;

import com.javaSchool.FinalTask3.domain.order.paymentMethod.PaymentMethodDTO;
import com.javaSchool.FinalTask3.domain.order.paymentMethod.PaymentMethodEntity;
import com.javaSchool.FinalTask3.domain.order.paymentMethod.PaymentMethodRepository;
import com.javaSchool.FinalTask3.domain.order.paymentMethod.PaymentMethodRestController;
import com.javaSchool.FinalTask3.utils.impl.AbstractRestControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * RestController of the {@link PaymentMethodEntity} entity. Handles the REST methods. Uses
 * {@link PaymentMethodDTO} as returning object.
 */
@RequestMapping(path = "payment_methods")
@RestController
public class PaymentMethodRestControllerImpl
        extends AbstractRestControllerImpl<PaymentMethodServiceImpl, PaymentMethodRepository, PaymentMethodEntity, PaymentMethodDTO, String>
        implements PaymentMethodRestController {
    /**
     * All arguments constructor.
     * @param service {@link PaymentMethodServiceImpl} of the {@link PaymentMethodEntity} entity.
     */
    public PaymentMethodRestControllerImpl(PaymentMethodServiceImpl service) {
        super(service);
    }

    @GetMapping("/search")
    @Override
    public ResponseEntity<List<PaymentMethodDTO>> getAllInstances(
            @RequestParam("active") Optional<Boolean> active){
        return ResponseEntity.ok(this.service.getAllInstances(active));
    }
}

package com.javaSchool.FinalTask3.domain.order.paymentStatus;

import com.querydsl.core.types.Predicate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface that extends from JpaRepository. Accesses the table of the entity {@link PaymentStatusEntity} identified
 * by an ID with String values.
 */
@Repository
public interface PaymentStatusRepository extends JpaRepository<PaymentStatusEntity, String>, QuerydslPredicateExecutor<PaymentStatusEntity> {
    List<PaymentStatusEntity> findAll(Predicate predicate);
}

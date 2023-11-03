package com.javaSchool.FinalTask3.domain.user.userAddress.postalCode.city;

import com.querydsl.core.types.Predicate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface that extends from JpaRepository. Accesses the table of the entity {@link CityEntity} identified by an ID with
 * String values.
 */
@Repository
public interface CityRepository extends JpaRepository<CityEntity, String>, QuerydslPredicateExecutor<CityEntity> {
    List<CityEntity> findAll(Predicate predicate);
}

package com.javaSchool.FinalTask3.domain.book.parameter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookParameterRepository extends JpaRepository<BookParameterEntity, Integer> {
}
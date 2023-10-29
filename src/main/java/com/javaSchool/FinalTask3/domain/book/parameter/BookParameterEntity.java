package com.javaSchool.FinalTask3.domain.book.parameter;

import com.javaSchool.FinalTask3.domain.book.parameter.format.BookParametersFormatEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

// TODO Might need to add something like edition
@AllArgsConstructor
@Builder
@Data
@Entity
@RequiredArgsConstructor
@Table(name = "book_parameters", schema = "public", catalog = "online_store")
public class BookParameterEntity {
    // TODO Use composite key instead of unique id, embeddable?
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    // TODO Add author as entity?
    @Column(name = "author", nullable = false, length = 60)
    private String author;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "format", referencedColumnName = "name", nullable = false)
    private BookParametersFormatEntity format;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}
package com.java_school.final_task.domain.order.payment_status;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Schema(description = "Payment status of a order")
@Table(name = "payment_statuses", schema = "public", catalog = "online_store")
public class PaymentStatusEntity {
    @Id
    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}

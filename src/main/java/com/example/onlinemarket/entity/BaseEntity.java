package com.example.onlinemarket.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    {
        this.isActive = true;
    }
    @Id
    @GeneratedValue
    private UUID id;
    private boolean isActive;
    @UpdateTimestamp
    private LocalDateTime createDate;
    @CreationTimestamp
    private LocalDateTime updateDate;
}

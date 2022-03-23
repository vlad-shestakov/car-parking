package com.shestakov.parkservice.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность - Парковочные места
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "parkspaces")
public class ParkspacesEntity {

    @Id
    @Column
    private int parkspaceid; // Код парковочного места

    @Column
    private int status; // Статус места / 0 - свободно / 1 - занято

}
package com.shestakov.carparking.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Сущность - Парковочные места клиентов
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "parkspace")
public class ParkspaceEntity{

    @Id
    @Column
    private int clientid;

    @Column
    private int parkspacenum;

}
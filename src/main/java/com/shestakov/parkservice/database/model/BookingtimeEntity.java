package com.shestakov.parkservice.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Сущность - Бронирования клиентов
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "bookingtime")
public class BookingtimeEntity {

    @Id
    @Column
    private int clientid;

    @Column
    private Date datestart;

    @Column
    private Date datefinish;

    @Column
    private int renttariff;

    @Column
    private float rentsum;

    @Column
    private float payedsum;

    @Column
    private int ispaid;

}
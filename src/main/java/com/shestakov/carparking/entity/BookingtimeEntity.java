package com.shestakov.carparking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * Бронирования
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "BOOKINGTIME")
public class BookingtimeEntity implements Serializable {

    @Id
//    @Column(name ="clientid")
//    private int clientid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
    private int bookingtimeid;

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

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clientid", nullable = false)
    private ClientEntity client;

}
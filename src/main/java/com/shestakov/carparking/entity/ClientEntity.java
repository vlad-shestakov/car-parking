package com.shestakov.carparking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Сущность - Клиенты-машины
 * с полями из таблиц Места для парковки и Оплатой
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="client")
@SecondaryTable(name = "parkspace", pkJoinColumns = @PrimaryKeyJoinColumn(name = "clientid"))
@SecondaryTable(name = "bookingtime", pkJoinColumns = @PrimaryKeyJoinColumn(name = "clientid"))
public class ClientEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientid;

    @Column
    private String licensenumber;

    // Добавляю к сущности поля из других таблиц
    @Column(table = "parkspace")
    private int parkspacenum;

    @Column(table = "bookingtime")
    private Date datestart;

    @Column(table = "bookingtime")
    private Date datefinish;

    @Column(table = "bookingtime")
    private int renttariff;

    @Column(table = "bookingtime")
    private float rentsum;

    @Column(table = "bookingtime")
    private float payedsum;

    @Column(table = "bookingtime")
    private int ispaid;

}
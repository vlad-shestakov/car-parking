package com.shestakov.carparking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * <pre>
 * @desc: Клиенты-машины
 * </pre>
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="CLIENT")
public class ClientEntity {

    @Id
//    @Column(name ="clientid",columnDefinition = "int(100) COMMENT 'Идентификатор клиента'")
    @Column(name ="clientid")
    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
//    @GeneratedValue(strategy = GenerationType.IDENTITY)   // Автозаполнение для MySQL
    private int clientid;

//    @Column(name = "licensenumber",columnDefinition = "varchar(100) COMMENT 'licensenumber'")
    @Column(name = "licensenumber")
    private String licensenumber;

}
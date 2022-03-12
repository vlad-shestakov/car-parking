package com.thinkingcao.springbootmapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="CLIENT")
public class ClientEntity {

    @Id
    @Column(name ="clientid",columnDefinition = "int(100) COMMENT 'Идентификатор клиента'")
    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientid;

    @Column(name = "licensenumber",columnDefinition = "varchar(100) COMMENT 'licensenumber'")
//    @Column(name = "licensenumber")
    private String licensenumber;

}
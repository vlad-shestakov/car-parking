package com.thinkingcao.springbootmapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PARKSPACE")
public class ParkspaceEntity{

    @Id
    @Column(name ="clientid",columnDefinition = "int(100) COMMENT 'Идентификатор клиента'")
//    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientid;

    @Column
    private int parkspacenum;

}
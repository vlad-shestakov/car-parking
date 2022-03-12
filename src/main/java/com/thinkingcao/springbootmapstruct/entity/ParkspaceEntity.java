package com.thinkingcao.springbootmapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PARKSPACE")
public class ParkspaceEntity {

    @Id
    @Column(name ="parkspaceid",columnDefinition = "int(100) COMMENT 'Идентификатор парковки'")
    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parkspaceid;

    @Column
    private Long clientid;

}
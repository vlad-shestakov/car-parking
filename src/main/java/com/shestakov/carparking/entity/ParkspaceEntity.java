package com.shestakov.carparking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Парковочные места
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PARKSPACE")
public class ParkspaceEntity implements Serializable {

    @Id
//    @ManyToOne(optional = false, cascade = CascadeType.ALL)
//    @JoinColumn(name = "parkspaces")
//    @Column(name ="clientid")
//    @Column(name ="clientid",columnDefinition = "int(100) COMMENT 'Идентификатор клиента'")
//    private int clientid;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
    private int parkspaceid;

    @Column
    private int parkspacenum;

//    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ParkspaceEntity> parkspaces = new ArrayList<>();

//    @ManyToOne(fetch = FetchType.LAZY)
//    private ClientEntity client;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "clientid", nullable = false)
//    private ClientEntity client;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clientid", nullable = false)
    private ClientEntity client;
}
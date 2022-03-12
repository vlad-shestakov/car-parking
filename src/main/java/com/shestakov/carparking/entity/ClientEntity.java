package com.shestakov.carparking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Клиенты-машины
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="CLIENT")
public class ClientEntity implements Serializable {

    @Id
    @Column(name ="clientid")
    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
    private int clientid;

    @Column(name = "licensenumber")
    private String licensenumber;

//    @OneToMany(mappedBy = "ClientEntity", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ParkspaceEntity> parkspaces = new ArrayList<>();

//    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<ParkspaceEntity> parkspaces;

    @OneToOne(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ParkspaceEntity parkspace;

    @OneToOne(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private BookingtimeEntity bookingtime;

}
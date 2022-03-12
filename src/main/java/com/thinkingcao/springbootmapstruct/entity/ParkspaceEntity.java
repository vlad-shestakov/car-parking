package com.thinkingcao.springbootmapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <pre>
 * @desc: Парковочные места
 * </pre>
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PARKSPACE")
public class ParkspaceEntity{

    @Id
//    @Column(name ="clientid",columnDefinition = "int(100) COMMENT 'Идентификатор клиента'")
    @Column(name ="clientid")
    private int clientid;

    @Column
    private int parkspacenum;

}
package com.thinkingcao.springbootmapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * <pre>
 * @desc: Бронирования
 * </pre>
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "BOOKINGTIME")
public class BookingtimeEntity {

    @Id
    @Column(name ="clientid")
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
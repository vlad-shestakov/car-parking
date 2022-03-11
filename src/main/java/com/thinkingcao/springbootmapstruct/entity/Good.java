package com.thinkingcao.springbootmapstruct.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <pre>
 * @desc: список продуктов
 * @author: cao_wencao
 * @date: 2019-11-04 22:36
 * @version: 1.0
 * </pre>
 */
@Entity
@Table(name="t_good")
@Data
public class Good {
    @Id
    @Column(name ="good_id",columnDefinition = "int(100) COMMENT 'Идентификатор номера продукта '")
    @GeneratedValue(strategy = GenerationType.AUTO)        // Первичный ключ автоматически увеличивается
    private int goodId;
    
    @Column(name = "good_type",columnDefinition = "varchar(100) COMMENT 'product category '")
    private String goodType;

    @Column(name = "good_name",columnDefinition = "varchar(100) COMMENT 'product name'")
    private String goodName;

    @Column(name = "good_num",columnDefinition = "int(100) COMMENT 'Количество товара'")
    private int goodNum;

    @Column(name = "good_price",columnDefinition = "int(100) COMMENT 'commodity price'")
    private int goodPrice;
}

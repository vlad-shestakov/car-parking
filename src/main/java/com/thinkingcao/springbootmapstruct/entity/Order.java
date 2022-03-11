package com.thinkingcao.springbootmapstruct.entity;

import lombok.Data;

import javax.persistence.*;

 /**
 * <pre>
 * @desc: Таблица заказов d
 * @author: cao_wencao
 * @date: 2019-11-04 22:36
 * @version: 1.0
 * </pre>
 */
@Entity
@Table(name="t_order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id" ,columnDefinition = "int(100) COMMENT 'order number id '")
    
    private int orderId;
    @Column(name = "good_id",columnDefinition = "int(100) COMMENT 'Идентификатор номера продукта '")
    private int goodId;

    @Column(name = "order_money" ,columnDefinition = "int(100) COMMENT 'order amount'")
    private double orderMoney;

    @Column(name = "receiver_address",columnDefinition = "varchar(255) COMMENT 'Receiving address'")
    private String receiverAddress;

    @Column(name = "receiver_name",columnDefinition = "varchar(100) COMMENT 'Receiving name'")
    private String receiverName;

    @Column(name = "receiver_phone",columnDefinition = "varchar(100) COMMENT 'phone number'")
    private String receiverPhone;

    @Column(name = "pay_state",columnDefinition = "int(100) COMMENT 'payment status'")
    private int payState;

  

   

}

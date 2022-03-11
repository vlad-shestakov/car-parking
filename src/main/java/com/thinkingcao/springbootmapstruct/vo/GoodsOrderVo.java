package com.thinkingcao.springbootmapstruct.vo;

import lombok.Data;

/**
 * <pre>
 * @desc: товарный заказ (объект передачи данных DTO)
 * @author: cao_wencao
 * @date: 2019-11-04 23:05
 * @version: 1.0
 * </pre>
 */
@Data
public class GoodsOrderVo {


    private int orderId; // ID номера заказа

    private int orderMoney; // Сумма заказа

    private int payState; // Статус платежа

    private String goodType; // Категория товара

    private String goodName; // Название товара

}

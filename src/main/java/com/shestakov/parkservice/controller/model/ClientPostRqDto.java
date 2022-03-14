package com.shestakov.parkservice.controller.model;

import lombok.Data;

import java.util.Date;

/**
 * Данные о загрузке парковки СОЗДАНИЕ ЗАПРОС
 */
@Data
public class ClientPostRqDto {

    private String licensenumber;   // Номер авто
    private int parkspacenum;       // Номер парковочного места
    private Date datestart;         // Дата начала парковки
    private int renttariff;         // Тариф парковки

}
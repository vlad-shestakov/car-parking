package com.shestakov.parkservice.controller.model;

import lombok.Data;
import java.util.Date;

/**
 * Данные о загрузке парковки (объект передачи данных DTO)
 */
@Data
public class ParkserviceDto {

    private int clientid;           // Код клиента-машины
    private String licensenumber;   // Номер авто
    private int parkspacenum;       // Номер парковочного места
    private Date datestart;         // Дата начала парковки
    private Date datefinish;        // Дата завершения парковки
    private int renttariff;         // Тариф парковки
    private float rentsum;          // Стоимость парковки
    private float payedsum;         // Оплаченная стоимость
    private int ispaid;             // Флаг оплаты

}
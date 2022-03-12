package com.thinkingcao.springbootmapstruct.vo;

import lombok.Data;
import java.util.Date;

@Data
public class ClientVo {

    private int clientid;           // Код клиента-машины
    private String licensenumber;   // Номер авто
    private int parkspacenum;       // Номер парковочного места
    private Date datestart;
    private Date datefinish;
    private int renttariff;
    private float rentsum;
    private float payedsum;
    private int ispaid;

}
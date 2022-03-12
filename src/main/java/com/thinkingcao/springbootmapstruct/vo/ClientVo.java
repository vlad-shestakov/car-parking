package com.thinkingcao.springbootmapstruct.vo;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ClientVo {

    private int clientid;           // Код клиента-машины
    private String licensenumber;   // Номер авто
    private int parkspacenum;       // Номер парковочного места

}

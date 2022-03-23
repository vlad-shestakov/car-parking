package com.shestakov.parkservice.interactor;

import com.shestakov.parkservice.database.model.ParkspacesEntity;

import java.util.List;

/**
 * Сервис управления парковочными местами
 */
public interface ParkspacesService {

    /**
     * @return Список всех парковочных мест
     */
    List<ParkspacesEntity> listAll();

    /**
     * @return Возвращает сколько свободных мест на парковке
     */
    long getFreeSpaces();

    /**
     * Занятие места
     * @param parkspaceid код места
     * @return парковочное место
     */
    ParkspacesEntity enterParking(int parkspaceid);

    /**
     * Освобождение места
     * @param parkspaceid код места
     * @return парковочное место
     */
    ParkspacesEntity leaveParking(int parkspaceid);

}

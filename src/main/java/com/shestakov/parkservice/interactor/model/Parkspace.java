package com.shestakov.parkservice.interactor.model;

import com.shestakov.parkservice.database.model.ParkspaceEntity;
import lombok.Value;

@Value
public class Parkspace {

    private int clientid;
    private int parkspacenum;

    public static Parkspace of(final ParkspaceEntity entity) {
        return new Parkspace(entity.getClientid(), entity.getParkspacenum());
    }
}

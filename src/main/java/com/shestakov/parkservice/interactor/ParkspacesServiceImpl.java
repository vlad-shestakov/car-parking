package com.shestakov.parkservice.interactor;

import com.shestakov.parkservice.database.model.ParkspacesEntity;
import com.shestakov.parkservice.database.repository.ParkspacesRepository;
import com.shestakov.parkservice.exceptions.ParkSpaceIsBusyException;
import com.shestakov.parkservice.exceptions.ParkSpaceIsEmptyException;
import com.shestakov.parkservice.exceptions.ParkSpaceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ParkspacesServiceImpl implements ParkspacesService {

    @Autowired
    private ParkspacesRepository parkspacesRepository;


    public List<ParkspacesEntity> listAll() {
        return parkspacesRepository.findAll();
    }

    public long getFreeSpaces(){
        return parkspacesRepository.countByStatus(0);
    }


    @Transactional
    public ParkspacesEntity enterParking(int parkspaceid){
        Optional<ParkspacesEntity> parkspacesEntity = parkspacesRepository.findById(parkspaceid);
        if (!parkspacesEntity.isPresent()){
            throw new ParkSpaceNotFoundException("Parkspace with parkspaceid : " + parkspaceid + " not found");
        } else if(parkspacesEntity.get().getStatus() == 1){
            throw new ParkSpaceIsBusyException("Parkspace with parkspaceid : " + parkspaceid + " IS BUSY");
        } else {
            parkspacesEntity.get().setStatus(1);
            return parkspacesEntity.get();
        }
    }

    @Transactional
    public ParkspacesEntity leaveParking(int parkspaceid){
        Optional<ParkspacesEntity> parkspacesEntity = parkspacesRepository.findById(parkspaceid);
        if (!parkspacesEntity.isPresent()){
            throw new ParkSpaceNotFoundException("Parkspace with parkspaceid : " + parkspaceid + " NOT FOUND");
        } else if(parkspacesEntity.get().getStatus() == 0){
            throw new ParkSpaceIsEmptyException("Parkspace with parkspaceid : " + parkspaceid + " IS ALREADY EMPTY");
        } else {
            parkspacesEntity.get().setStatus(0);
            return parkspacesEntity.get();
        }
    }

}

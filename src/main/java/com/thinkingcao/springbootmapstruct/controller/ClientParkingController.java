package com.thinkingcao.springbootmapstruct.controller;

import com.thinkingcao.springbootmapstruct.entity.BookingtimeEntity;
import com.thinkingcao.springbootmapstruct.entity.ParkspaceEntity;
import com.thinkingcao.springbootmapstruct.mapper.ParkspaceRepository;
import com.thinkingcao.springbootmapstruct.mapper.BookingtimeRepository;
import com.thinkingcao.springbootmapstruct.vo.ClientParkingVo;
import com.thinkingcao.springbootmapstruct.entity.ClientEntity;
import com.thinkingcao.springbootmapstruct.inter.ClientParkingMapper;
import com.thinkingcao.springbootmapstruct.mapper.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * <pre>
 * @desc: Контроллер для управления парковкой
 * </pre>
 */
@RestController
@RequestMapping("/clientParking")
public class ClientParkingController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ParkspaceRepository parkspaceRepository;

    @Autowired
    private BookingtimeRepository bookingtimeRepository;

    @Autowired
    private ClientParkingMapper clientParkingMapper;

    @RequestMapping(value = "/detail/{clientid}", method = RequestMethod.GET)
    public ClientParkingVo details(@PathVariable(value = "clientid") Integer clientid) {


        ClientEntity clientInfo = clientRepository.findById(clientid).get();

        Optional<ParkspaceEntity> optionalT = parkspaceRepository.findById(clientid);
        ParkspaceEntity parkspaceInfo = optionalT.isPresent() ? optionalT.get() : null;

        Optional<BookingtimeEntity> optionalB = bookingtimeRepository.findById(clientid);
        BookingtimeEntity bookingtimeInfo = optionalB.isPresent() ? optionalB.get() : null;


        return clientParkingMapper.fromClientParkingDTO(clientInfo, parkspaceInfo, bookingtimeInfo);
    }
}


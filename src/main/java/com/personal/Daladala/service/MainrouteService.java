package com.personal.Daladala.service;


import com.personal.Daladala.dto.MainrouteDto;
import com.personal.Daladala.entity.Mainroute;
import com.personal.Daladala.repository.MainrouteRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Base64;

@Data
@Service
@AllArgsConstructor
public class MainrouteService {

    @Autowired
    private static MainrouteRepository mainrouteRepository;

    private final ModelMapper mapper;



    public void addRoute(MainrouteDto mainrouteDto){
        Mainroute mainroute = mapper.map(mainrouteDto,Mainroute.class);
        mainroute.setCreatedAt(LocalDate.now());
        mainrouteRepository.save(mainroute);
    }
}

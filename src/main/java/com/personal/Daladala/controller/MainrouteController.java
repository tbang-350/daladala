package com.personal.Daladala.controller;


import com.personal.Daladala.dto.MainrouteDto;
import com.personal.Daladala.entity.Mainroute;
import com.personal.Daladala.service.MainrouteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Base64;
import java.util.Objects;

@RestController
@RequestMapping(name = "/api/main")
@AllArgsConstructor
public class MainrouteController {

    @Autowired
    private final MainrouteService mainrouteService;

    public static final String dir = System.getProperty("user.home")+"/UPLOADS";


//    @PostMapping("addMainroute")
//    public void addMainroute(@ModelAttribute MainrouteDto mainrouteDto , @RequestParam("image")MultipartFile file) throws IOException {
//        String filename = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
//        mainroute.setImage(Base64.getEncoder().encodeToString(mainrouteDto.getImgBytes().getBytes()));
//        mainrouteService.addMainroute(mainrouteDto);
//    }

    @PostMapping("addMAinroue")
    public void addMainroute (@ModelAttribute MainrouteDto mainrouteDto , @RequestParam("image") MultipartFile file) throws IOException {
        String filename = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        mainrouteDto.setImage(filename);
        mainrouteService.addRoute(mainrouteDto);
        Path fileStorage = Paths.get(dir,filename).toAbsolutePath().normalize();
        Files.copy(file.getInputStream(),fileStorage, StandardCopyOption.REPLACE_EXISTING);
    }
}

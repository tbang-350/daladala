package com.personal.Daladala.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
public class MainrouteDto {
    private String route_name;
    private String image;
}

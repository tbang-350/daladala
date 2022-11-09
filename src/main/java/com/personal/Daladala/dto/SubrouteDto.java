package com.personal.Daladala.dto;

import com.personal.Daladala.entity.Mainroute;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.Set;

@Data
public class SubrouteDto {
    private String sroute_name;
    private Double latitude;
    private Double longitude;
    private Set<Mainroute> mainroutes;
    private LocalDate createdAt;
    private MultipartFile imgBytes;
}

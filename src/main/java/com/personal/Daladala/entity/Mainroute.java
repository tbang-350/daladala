package com.personal.Daladala.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mainroute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mroute_id;
    private String route_name;
    private String image;
    private LocalDate createdAt;

    public Mainroute(String route_name, String image, LocalDate createdAt) {
        this.route_name = route_name;
        this.image = image;
        this.createdAt = createdAt;
    }
}

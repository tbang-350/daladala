package com.personal.Daladala.controller;

import com.personal.Daladala.service.SubrouteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class SubrouteController {

    @Autowired
    private static SubrouteService subrouteService;
}

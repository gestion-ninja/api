package fr.gestionninja.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gestionninja.api.data.Ninja;
import fr.gestionninja.api.service.NinjaService;

import java.util.List;

@RestController
@RequestMapping(
    path = "ninja",
    produces = MediaType.APPLICATION_JSON_VALUE
)
class NinjaController {

    @Autowired private NinjaService ninjaService;

    @GetMapping
    public List<Ninja> getNinjas() {
        return ninjaService.getNinjas();
    }
    
    @GetMapping(path = "test")
    public String test() {
        return ninjaService.test();
    }
}
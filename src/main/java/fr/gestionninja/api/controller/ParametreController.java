package fr.gestionninja.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gestionninja.api.data.Affinitee;
import fr.gestionninja.api.data.EtatMission;
import fr.gestionninja.api.data.RangMission;
import fr.gestionninja.api.data.RangNinja;
import fr.gestionninja.api.service.ParametreService;

@RestController
@RequestMapping(
    path = "parametre",
    produces = MediaType.APPLICATION_JSON_VALUE
)
@CrossOrigin
class ParametreController {

    @Autowired private ParametreService parametreService;

    @GetMapping(path = "rangninja")
    public List<RangNinja> getRangsNinja() {
        return parametreService.getRangsNinjas();
    }

    @PostMapping(path = "rangninja")
    public int addRangsNinja(@RequestBody List<RangNinja> rangsNinja) {
        return parametreService.addRangsNinjas(rangsNinja);
    }

    @GetMapping(path = "rangmission")
    public List<RangMission> getRangsMission() {
        return parametreService.getRangsMission();
    }

    @PostMapping(path = "rangmission")
    public int addRangsMission(@RequestBody List<RangMission> rangsMission) {
        return parametreService.addRangsMission(rangsMission);
    }

    @GetMapping(path = "affinitee")
    public List<Affinitee> getAffinitees() {
        return parametreService.getAffinitees();
    }

    @PostMapping(path = "affinitee")
    public int addAffinitees(@RequestBody List<Affinitee> affinitees) {
        return parametreService.addAffinitees(affinitees);
    }

    @GetMapping(path = "etatmission")
    public List<EtatMission> getEtatsMission() {
        return parametreService.getEtatsMission();
    }

    @PostMapping(path = "etatmission")
    public int addEtatsMission(@RequestBody List<EtatMission> etatsMission) {
        return parametreService.addEtatsMission(etatsMission);
    }
}
package fr.gestionninja.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gestionninja.api.data.Mission;
import fr.gestionninja.api.data.Ninja;
import fr.gestionninja.api.service.MissionService;
import fr.gestionninja.api.service.NinjaService;

@RestController
@RequestMapping(path = "mission", produces = MediaType.APPLICATION_JSON_VALUE)
class MissionController {

    @Autowired
    private MissionService missionService;

    @GetMapping
    public ResponseEntity<List<Mission>> getMissions() {
        final List<Mission> missions = missionService.getMissions();
        if (missions.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(missions);
        }
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Mission> getMission(@PathVariable("id") final String id) {
        final Mission mission = missionService.getMission(id);
        if (null == mission) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(mission);
        }
    }

    @PostMapping
    public ResponseEntity<Mission> addMission(@RequestBody final Mission _mission) {
        final Mission mission = missionService.createMission(_mission);
        if (null == mission) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(mission);
        }
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Mission> updateMission(@PathVariable("id") final String id, @RequestBody final Mission _mission) {
        final Mission mission = missionService.updateMission(id, _mission);
        if (null == mission) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(mission);
        }
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> deleteMission(@PathVariable("id") final String id) {
        final boolean reussite = missionService.deleteMission(id);
        if (!reussite) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
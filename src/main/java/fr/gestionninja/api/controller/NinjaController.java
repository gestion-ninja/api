package fr.gestionninja.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.gestionninja.api.data.Ninja;
import fr.gestionninja.api.service.NinjaService;

@RestController
@RequestMapping(
    path = "ninja",
    produces = MediaType.APPLICATION_JSON_VALUE
)
@CrossOrigin
class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public ResponseEntity<List<Ninja>> getNinjas() {
        final List<Ninja> ninjas = ninjaService.getNinjas();
        if (ninjas.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ninjas);
        }
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Ninja> getNinja(@PathVariable("id") final String id) {
        final Ninja ninja = ninjaService.getNinja(id);
        if (null == ninja) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ninja);
        }
    }

    @PostMapping
    public ResponseEntity<Ninja> addNinja(@RequestBody final Ninja _ninja) {
        final Ninja ninja = ninjaService.createNinja(_ninja);
        if (null == ninja) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ninja);
        }
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Ninja> updateNinja(@PathVariable("id") final String id, @RequestBody final Ninja _ninja) {
        final Ninja ninja = ninjaService.updateNinja(id, _ninja);
        if (null == ninja) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(ninja);
        }
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> deleteNinja(@PathVariable("id") final String id) {
        final boolean reussite = ninjaService.deleteNinja(id);
        if (!reussite) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
package com.example.demo.controller;

import com.example.demo.modele.Materiel;
import com.example.demo.service.MaterielService;
import lombok.AllArgsConstructor;
import org.springramework.web.blind.annotation.RequestMapping;
import org.springramework.web.blind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materiel")
@AllArgsConstructor
public class MaterielController {
    private final MaterielService materielService;

    @PostMapping("/create")
    public Materiel create(@RequestBody Materiel materiel) {
        return materielService.creer(materiel);
    }

    @GetMapping("/read")
    public List<Materiel> read() {
        return materielService.lire();
    }

    @PutMapping("/update/{id]")
    public Materiel update(@PathVariable Long id, @RequestBody Materiel materiel) {
        return materielService.modifier(id, materiel);
    }

    @DeleteMapping("/delete/{id]")
    public String delete(@pathVariable Long id) {
        return materielService.supprimer(id);
    }

    public MaterielController(MaterielService materielService) {
        this.materielService = materielService;
    }
}

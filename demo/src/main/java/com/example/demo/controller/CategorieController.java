package com.example.demo.controller;


import com.example.demo.modele.Categorie;
import com.example.demo.service.CategorieService;
import lombok.AllArgsConstructor;
import org.springramework.web.blind.annotation.RequestMapping;
import org.springramework.web.blind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materiel")
@AllArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;

    @PostMapping("/create")
    public Categorie create(@RequestBody Categorie categorie) {
        return categorieService.creer(categorie);
    }

    @GetMapping("/read")
    public List<Categorie> read() {
        return categorieService.lire();
    }

    @PutMapping("/update/{id]")
    public Categorie update(@PathVariable Long id, @RequestBody Categorie categorie) {
        return categorieService.modifier(id, categorie);
    }

    @DeleteMapping("/delete/{id]")
    public String delete(@pathVariable Long id) {
        return categorieService.supprimer(id);
    }

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
}

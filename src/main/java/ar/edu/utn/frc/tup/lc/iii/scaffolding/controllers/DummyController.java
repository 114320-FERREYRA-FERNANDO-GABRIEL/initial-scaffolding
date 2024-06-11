package ar.edu.utn.frc.tup.lc.iii.scaffolding.controllers;


import ar.edu.utn.frc.tup.lc.iii.scaffolding.dtos.DummyDto;
import ar.edu.utn.frc.tup.lc.iii.scaffolding.models.Dummy;
import ar.edu.utn.frc.tup.lc.iii.scaffolding.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//estableceos conexiones entre controlador y servicios @controller
@RestController

// @RequestMapping("/dummy") evitamos poner a cada verbo dummy en parametro
@RequestMapping("")

public class DummyController {
    // inyectamos Dummyservice en controlador con @Autowired
    @Autowired
    private DummyService dummyService;


    //get para recorrer todos aqui recibimos un parameto
    @GetMapping("")
    public ResponseEntity<DummyDto> getDummyList() {
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;
    }

   // get para la lista  aqui recibimos un id
    @GetMapping("/{id}")
    public ResponseEntity<DummyDto> getDummy(@PathVariable Long id) {
        Dummy dummy = dummyService.getDummy(id);
        return null;
    }


    @PostMapping("")
    public ResponseEntity<DummyDto> createDummy(DummyDto dto) {
        Dummy dummy = dummyService.createDummy(null);
        return null;
    }

    @PutMapping("")
    public ResponseEntity<DummyDto> updateDummy(DummyDto dto) {
        Dummy dummy = dummyService.updateDummy(null);
        return null;
    }

    @DeleteMapping("/dummy")
    public ResponseEntity<Void> deleteDummy(DummyDto dto) {
         dummyService.deleteDummy(null);
        return null;
    }
}

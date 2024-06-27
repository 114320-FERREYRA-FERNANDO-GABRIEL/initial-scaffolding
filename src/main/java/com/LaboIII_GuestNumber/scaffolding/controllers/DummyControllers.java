package com.LaboIII_GuestNumber.scaffolding.controllers;

import com.LaboIII_GuestNumber.scaffolding.dtos.DummyDto;
import com.LaboIII_GuestNumber.scaffolding.models.Dummy;
import com.LaboIII_GuestNumber.scaffolding.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class DummyControllers {
    @Autowired
    private DummyService dummyService;

    @GetMapping("")
    public ResponseEntity<DummyDto> getDummyList() {
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DummyDto> getDummyList(@PathVariable Long id) {
        Dummy dummy = dummyService.getDummy(id);
            return null;
    }

    @PostMapping("")
    public ResponseEntity<DummyDto> createDummy(DummyDto Dummydto) {
        Dummy dummy = dummyService.createDummy(null);
        return null;
    }

    @PutMapping("")
    public ResponseEntity<DummyDto> updateDummy(DummyDto Dummydto) {
        Dummy dummy = dummyService.updateDummy(null);
        return null;
    }

    @DeleteMapping("")
    public ResponseEntity<DummyDto> deleteDummy(DummyDto Dummydto) {
        dummyService.deleteDummy(null);//no va Dummy dummy porque es un void
        return null;
    }

}

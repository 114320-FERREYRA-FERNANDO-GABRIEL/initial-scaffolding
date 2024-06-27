package com.LaboIII_GuestNumber.scaffolding.services;

import com.LaboIII_GuestNumber.scaffolding.models.Dummy;

import java.util.List;

public interface DummyService {

    Dummy getDummy (Long id);

    List<Dummy> getDummyList();

    Dummy createDummy(Dummy dummy);

    Dummy updateDummy(Dummy dummy);

    void deleteDummy(Dummy dummy);
}

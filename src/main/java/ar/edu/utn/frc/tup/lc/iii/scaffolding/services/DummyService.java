package ar.edu.utn.frc.tup.lc.iii.scaffolding.services;

import ar.edu.utn.frc.tup.lc.iii.scaffolding.models.Dummy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {


    // lista de servicios  que vamos  a incluir

    Dummy getDummy(Long id);//pedido por id

    List<Dummy> getDummyList();

    Dummy createDummy(Dummy dummy);

    Dummy updateDummy(Dummy dummy);

    void deleteDummy(Dummy dummy);


}

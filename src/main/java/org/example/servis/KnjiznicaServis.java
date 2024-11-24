package org.example.servis;

import org.example.model.Knjiga;

public interface KnjiznicaServis {

    void dodajKnjiguUKnjiznicu(Knjiga knjiga);
    void dodajKnjiguUPosudene(Knjiga knjiga, String clanskiBroj);
}

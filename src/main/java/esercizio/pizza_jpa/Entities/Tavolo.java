package esercizio.pizza_jpa.Entities;


import esercizio.pizza_jpa.enumeration.StatoTavolo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class Tavolo {


    private int numero;
    private int numeroMaxCoperti;
    private StatoTavolo statoTavolo;
    private double costoCoperto;


}

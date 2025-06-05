package esercizio.pizza_jpa.Entities;


import esercizio.pizza_jpa.enumeration.StatoTavolo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tavoli")
@Data
@NoArgsConstructor
public class Tavolo {

    @Id
    @GeneratedValue
    private int numero;
    private int numeroMaxCoperti;

    @Enumerated(EnumType.STRING)
    private StatoTavolo statoTavolo;
    private double costoCoperto;

    @OneToMany(mappedBy = "tavolo")
    private List<Ordine> ordini;
}

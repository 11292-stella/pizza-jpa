package esercizio.pizza_jpa.Entities;


import esercizio.pizza_jpa.enumeration.StatoOrdine;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalTime;
import java.util.List;


@Data
@NoArgsConstructor
public class Ordine {


    private int numOrdine;
    private LocalTime oraOrdine;
    private int numCoperti;
    private StatoOrdine statoOrdine;


    private Tavolo tavolo;


    private List<Prodotto> prodotti;

    public double totaleOrdine(){
        return numCoperti*tavolo.getCostoCoperto() +
                prodotti.stream().mapToDouble(Prodotto::getPrezzo).sum();
    }
}

package esercizio.pizza_jpa.Entities;


import esercizio.pizza_jpa.enumeration.StatoOrdine;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Ordine {

    @Id
    @GeneratedValue
    private int numOrdine;
    private LocalTime oraOrdine;
    private int numCoperti;
    private StatoOrdine statoOrdine;

    @ManyToMany
    @JoinColumn(name = "tavolo_id")
    private Tavolo tavolo;

    @ManyToMany
    @JoinTable(
            name = "ordine_prodotti",
            joinColumns = @JoinColumn(name = "ordine_id"),
            inverseJoinColumns = @JoinColumn(name = "prodotto_id")
    )
    private List<Prodotto> prodotti;

    public double totaleOrdine(){
        return numCoperti*tavolo.getCostoCoperto() +
                prodotti.stream().mapToDouble(Prodotto::getPrezzo).sum();
    }
}

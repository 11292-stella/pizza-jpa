package esercizio.pizza_jpa.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public abstract class Prodotto {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private double prezzo;
    private int calorie;
}

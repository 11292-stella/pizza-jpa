package esercizio.pizza_jpa.Entities;



import esercizio.pizza_jpa.enumeration.TipoDrink;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data//creare automaticamente tutti i metodi di base di una classe attraverso Lombok
@NoArgsConstructor//crea il costruttore vuoto
@ToString(callSuper = true)//questa annotazione fa capire a Spring che deve chiamare
//anche il ToString della superclasse
public class Drink extends Prodotto{

    @Enumerated(EnumType.STRING)
    private TipoDrink tipoDrink;
}

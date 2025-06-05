package esercizio.pizza_jpa.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Topping extends Prodotto{

    @Id
    @GeneratedValue
    private int id;
    private boolean glutenFree;
}

package esercizio.pizza_jpa.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Topping extends Prodotto{


    private boolean glutenFree;

    @ManyToMany
    @JoinTable(name = "topping_pizza",
            joinColumns = @JoinColumn(name = "topping_id"),
            inverseJoinColumns = @JoinColumn(name = "pizza_id"))
    private List<Pizza> pizze;
}

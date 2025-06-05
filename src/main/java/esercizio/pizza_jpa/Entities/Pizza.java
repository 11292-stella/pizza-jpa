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
//@Component
public class Pizza extends Prodotto{
    //@Autowired(required = false)
    /*
    viene prima creata l'oggetto di tipo Pizza e poi viene iniettato in questo
    oggetto la lista di topping che ci sono nel contesto
     */
    @ManyToMany(mappedBy = "pizze", fetch = FetchType.EAGER)
    private List<Topping> toppings;

    //@Autowired(required = false)
    /*
    questo autowired inietta la lista di topping direttamente nell'oggetto pizza
    già in fase di creazione dell'oggetto Pizza
     */
    public Pizza(List<Topping> toppings) {
        this.toppings = toppings;
    }

    //@Autowired(required = false)
    /*
    l'oggetto pizza viene prima creato vuoto e poi automaticamente viene chiamato
    da Spring il set su questo oggetto per iniettargli la lista di topping
     */
    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}

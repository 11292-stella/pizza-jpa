package esercizio.pizza_jpa.repository;

import esercizio.pizza_jpa.Entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Integer> {


}

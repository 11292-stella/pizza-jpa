package esercizio.pizza_jpa.repository;

import esercizio.pizza_jpa.Entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink,Integer> {
}

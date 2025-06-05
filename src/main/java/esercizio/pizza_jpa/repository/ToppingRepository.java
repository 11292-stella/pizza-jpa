package esercizio.pizza_jpa.repository;

import esercizio.pizza_jpa.Entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping,Integer> {
}

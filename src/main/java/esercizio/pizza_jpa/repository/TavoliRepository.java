package esercizio.pizza_jpa.repository;

import esercizio.pizza_jpa.Entities.Tavolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TavoliRepository extends JpaRepository<Tavolo,Integer> {
}

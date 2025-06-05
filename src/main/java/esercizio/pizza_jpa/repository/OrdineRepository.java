package esercizio.pizza_jpa.repository;

import esercizio.pizza_jpa.Entities.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<Ordine,Integer> {
}

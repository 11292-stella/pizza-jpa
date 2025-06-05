package esercizio.pizza_jpa.repository;

import esercizio.pizza_jpa.Entities.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdottoRepository extends JpaRepository<Prodotto,Integer> {
    List<Prodotto> findByCalorieGreaterThan(int calorie);

    List<Prodotto> findByNomeLike(String nome);
}

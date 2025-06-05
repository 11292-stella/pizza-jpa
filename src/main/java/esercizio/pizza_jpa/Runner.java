package esercizio.pizza_jpa;

import esercizio.pizza_jpa.Entities.Drink;
import esercizio.pizza_jpa.Entities.Pizza;
import esercizio.pizza_jpa.Entities.Tavolo;
import esercizio.pizza_jpa.Entities.Topping;
import esercizio.pizza_jpa.repository.*;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Runner implements CommandLineRunner {


    @Autowired
    private ProdottoRepository prodottoRepository;

    @Autowired
    @Qualifier("cocaCola")
    private Drink cocaCola;

    @Autowired
    @Qualifier("water")
    private Drink water;

    @Autowired
    @Qualifier("tomato")
    private Topping tomato;

    @Autowired
    @Qualifier("mozzarella")
    private Topping mozzarella;

    @Autowired
    @Qualifier("prosciuttoCotto")
    private Topping prosciuttoCotto;

    @Autowired
    @Qualifier("margherita")
    private Pizza margherita;

    @Autowired
    @Qualifier("primavera")
    private Pizza primavera;


    @Override
    public void run(String... args) throws Exception {

        //salvo i drink
        prodottoRepository.save(cocaCola);
        prodottoRepository.save(water);

        //salvo le pizze
        prodottoRepository.save(margherita);
        prodottoRepository.save(primavera);

        //setto le pizze sui topping e salvo i topping
        mozzarella.setPizze(Arrays.asList(margherita,primavera));
        tomato.setPizze(Arrays.asList(margherita,primavera));
        prosciuttoCotto.setPizze(Arrays.asList(primavera));

        prodottoRepository.save(mozzarella);
        prodottoRepository.save(tomato);
        prodottoRepository.save(prosciuttoCotto);

    }
}

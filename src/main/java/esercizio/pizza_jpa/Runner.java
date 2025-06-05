package esercizio.pizza_jpa;

import esercizio.pizza_jpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

public class Runner implements CommandLineRunner {


    @Autowired
    private ApplicationContext ctx;


    @Autowired
    private PizzaRepository pizzaRepository;
    @Autowired
    private DrinkRepository drinkRepository;
    @Autowired
    private ToppingRepository toppingRepository;
    @Autowired
    private TavoliRepository tavoliRepository;
    @Autowired
    private OrdineRepository ordineRepository;




    @Override
    public void run(String... args) throws Exception {





    }
}

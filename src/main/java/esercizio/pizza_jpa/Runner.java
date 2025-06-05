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

import java.util.Arrays;

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

        Topping tomato = ctx.getBean("tomato", Topping.class);
        Topping mozzarella = ctx.getBean("Mozzarella", Topping.class);
        Topping prosciuttoCotto = ctx.getBean("prosciuttoCotto", Topping.class);

        toppingRepository.saveAll(Arrays.asList(tomato,mozzarella,prosciuttoCotto));

        Pizza margherita = ctx.getBean("margherita", Pizza.class);
        Pizza primavera = ctx.getBean("primavera", Pizza.class);

        pizzaRepository.saveAll(Arrays.asList(margherita,primavera));

        Drink water = ctx.getBean("water", Drink.class);
        Drink cocaCola = ctx.getBean("cocaCola", Drink.class);

        drinkRepository.saveAll(Arrays.asList(water,cocaCola));

        Tavolo t1 = ctx.getBean("t1", Tavolo.class);
        Tavolo t2 = ctx.getBean("t2", Tavolo.class);

        tavoliRepository.saveAll(Arrays.asList(t1,t2));


        




    }
}

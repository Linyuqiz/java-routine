package main.grammar.lang;

import main.grammar.model.Animal;
import org.junit.jupiter.api.Test;

/**
 * @author: axemc
 * @dateTime: 2022/04/10 00:09:28
 */
public class ThreadLocalTest {

    @Test
    void threadLocal() {
        ThreadLocal<Animal> animalThreadLocal = ThreadLocal.withInitial(Animal::new);
        Animal animal = animalThreadLocal.get();
        System.out.println(animal);
    }

}

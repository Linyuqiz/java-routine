package main.function;

import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

@SuppressWarnings("all")
public class BiFunctionInterfaceTest {

    @Test
    void biConsumerDemo() {
        doBiConsumer(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(String.format("%s, %s", s, s2));
            }
        }, "message", "describe!");
    }

    private void doBiConsumer(BiConsumer<String, String> consumer, String msg, String desc) {
        consumer.accept(msg, desc);
    }

    @Test
    void biFunctionDemo() {
        Integer integer = doBiFunction(new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer * integer2;
            }
        }, 11);
        System.out.println(integer);
    }

    private Integer doBiFunction(BiFunction<Integer, Integer, Integer> function, Integer integer) {
        return function.apply(integer, integer);
    }

    @Test
    void biPredicateDemo() {
        boolean biPredicate = doBiPredicate(new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer integer, Integer integer2) {
                return integer * integer2 > 0;
            }
        }, 11);
        System.out.println(biPredicate);
    }

    private boolean doBiPredicate(BiPredicate<Integer, Integer> predicate, Integer integer) {
        return predicate.test(integer, integer);
    }

    @Test
    void biSuppliesDemo() {
        /**
         * Supplies 不存在 BiSupplies
         */
    }

    @Test
    void biOperatorDemo() {
        Integer integer = doBiOperator(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer - integer2;
            }
        }, 11, 100);
        System.out.println(integer);
    }

    /**
     * BinaryOperator 是 BiFunction 的子类
     *
     * @param operator
     * @param i1
     * @param i2
     * @return
     */
    private Integer doBiOperator(BinaryOperator<Integer> operator, Integer i1, Integer i2) {
        return operator.apply(i1, i2);
    }
}

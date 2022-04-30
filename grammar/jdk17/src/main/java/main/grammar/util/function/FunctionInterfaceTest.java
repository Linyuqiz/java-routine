package main.grammar.util.function;

import org.junit.jupiter.api.Test;

import java.util.function.*;

@SuppressWarnings("all")
public class FunctionInterfaceTest {

    @Test
    void consumerDemo() {
        doConsumer(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }, "this is a consumer example!");
    }

    private void doConsumer(Consumer<String> consumer, String msg) {
        consumer.accept(msg);
    }

    @Test
    void functionDemo() {
        String res = doFunction(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return String.format("Hello, %s!", s);
            }
        }, "Axemc");
        System.out.println(res);
    }

    private String doFunction(Function<String, String> function, String msg) {
        return function.apply(msg);
    }

    @Test
    void predicateDemo() {
        boolean predicate = doPredicate(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "PREDICATE".equals(s.toUpperCase());
            }
        }, "predicate");
        System.out.println(predicate);
    }

    private boolean doPredicate(Predicate<String> predicate, String msg) {
        return predicate.test(msg);
    }

    @Test
    void suppliesDemo() {
        String supplies = doSupplies(new Supplier<String>() {
            @Override
            public String get() {
                return new String("this is a supplies!");
            }
        });
        System.out.println(supplies);
    }

    private String doSupplies(Supplier<String> supplier) {
        return supplier.get();
    }

    @Test
    void operatorDemo() {
        Integer integer = doOperator(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        }, 11);
        System.out.println(integer);
    }

    /**
     * UnaryOperator 是 Function 的子类
     *
     * @param operator
     * @param integer
     * @return
     */
    private Integer doOperator(UnaryOperator<Integer> operator, Integer integer) {
        return operator.apply(integer);
    }

}

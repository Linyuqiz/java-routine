package main.loader;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

public class ClassLoaderTest {

    @Test
    @SneakyThrows
    void classLoader() {
        Class<?> cls = Class.forName("main.model.Animal");
        System.out.println(cls.newInstance());
    }

}

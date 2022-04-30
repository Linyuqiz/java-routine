package main.grammar.lang;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author: axemc
 * @dateTime: 2022/04/10 00:51:53
 */
public class ClassLoaderTest {

    @Test
    void classLoader() {
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(ClassLoader.getPlatformClassLoader());
    }

}

package main.utils;

import lombok.SneakyThrows;

public class UnsafeUtils {

//    private static Unsafe UNSAFE;

    @SneakyThrows
    private UnsafeUtils() {
//        Field field = Unsafe.class.getDeclaredField("theUnsafe");
//        field.setAccessible(true);
//        UNSAFE = (Unsafe) field.get(null);
    }

//    public static Unsafe getInstance() {
//        return UNSAFE;
//    }

}

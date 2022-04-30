package main.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author: axemc
 * @dateTime: 2022/04/09 22:03:03
 */
public class JacksonTest {

    @Test
    @SneakyThrows
    void json() {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

        Car car = objectMapper.readValue(carJson, Car.class);
        System.out.println("car brand = " + car.getBrand());
        System.out.println("car doors = " + car.getDoors());
    }

    @Test
    @SneakyThrows
    void json1() {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

        Car car = objectMapper.readValue(carJson, Car.class);
        System.out.println(objectMapper.writeValueAsString(car));
    }

    @Test
    @SneakyThrows
    void json2() {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(new Date()));
    }

}

@Data
@With
@NoArgsConstructor
@AllArgsConstructor
class Car {
    @JsonProperty
    private String brand;
    private int doors;
}


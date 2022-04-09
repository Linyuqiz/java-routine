package main.http;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

/**
 * @author: axemc
 * @dateTime: 2022/04/09 21:15:38
 */
public class OkHttpTest {

    @Test
    void http() {
        HttpClient.newHttpClient().sendAsync(
                        HttpRequest.newBuilder()
                                .uri(URI.create("https://openjdk.java.net/"))
                                .build(),
                        HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)
                )
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }

    @Test
    void http1() {
        HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build()
                .sendAsync(
                        HttpRequest.newBuilder()
                                .uri(URI.create("https://openjdk.java.net/"))
                                .timeout(Duration.ofMinutes(1))
                                .header("Content-Type", "application/json")
                                .build(),
                        HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)
                )
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

}

package main.http;

import lombok.SneakyThrows;
import okhttp3.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author: axemc
 * @dateTime: 2022/04/18 23:52:22
 */
public class OkHttpClientTest {

    @Test
    @SneakyThrows
    public void http() {
        OkHttpClient okHttpClient = new OkHttpClient();

        HashMap<String, String> stringHashMap = new HashMap<String, String>();
        stringHashMap.put("Trantor-Appkey", "trantor");
        stringHashMap.put("Content-Type", "application/json");

        RequestBody formBody = new FormBody.Builder()
                .add("name", "gaia")
                .add("key", "gaia")
                .build();

        Response response = okHttpClient.newCall(
                new Request.Builder()
                        .url("http://user.services--6fe77a9ce2546badd7051892d644a88f.svc.cluster.local:8080/api/user/admin/origin/update")
                        .headers(Headers.of(stringHashMap))
                        .post(formBody)
                        .build()
        ).execute();
        if (!response.isSuccessful()) {
            System.out.println("12223123123");
        }
    }

    @Test
    public void http1() {
        OkHttpClient okHttpClient = new OkHttpClient();

        HashMap<String, String> paramMap = new HashMap<String, String>(2);
        paramMap.put("name", "gaia");
        paramMap.put("name", "gaia");
        paramMap.put("appkey", "gaia");

        Request request = new Request.Builder()
                .addHeader("content-type", "application/json")
                .addHeader("Trantor-Appkey", "trantor")
                .addHeader("Appkey", "trantor")
                .url("https://way.jd.com/jisuapi/weather")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), paramMap.toString()))
                .build();

        String result = null;
        try {
            result = okHttpClient.newCall(request).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }

}

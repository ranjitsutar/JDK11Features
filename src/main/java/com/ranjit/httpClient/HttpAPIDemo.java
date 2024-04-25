package com.ranjit.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpAPIDemo {
    public static void main(String[] args) {

        String uri= "https://postman-echo.com/get?uname:=ranjit&pwd=1234";
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpClient client=HttpClient.newBuilder()
                .build();

        try {
           HttpResponse response= client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

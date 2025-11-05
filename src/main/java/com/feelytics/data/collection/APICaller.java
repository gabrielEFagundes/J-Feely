package com.feelytics.data.collection;

import com.feelytics.data.model.Basis;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class APICaller {

    public Basis getApiData(String query){
        try {
            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("localhost:5000/api/data/reddit" + query))
                    .timeout(Duration.ofSeconds(10))
                    .header("Java Data Collector", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 200){
                // then turn this into GSON
            }

        }catch(Exception e){
            return null;
        }

        return null;
    }

}

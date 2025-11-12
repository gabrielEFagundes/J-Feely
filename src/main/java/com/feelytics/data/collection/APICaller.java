package com.feelytics.data.collection;

import com.feelytics.data.model.Basis;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONObject;

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
                    .uri(URI.create("http://localhost:5000/api/data/reddit?query=" + query))
                    .timeout(Duration.ofSeconds(10))
                    .header("JFeelyCollector", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(query))
                    .timeout(Duration.ofSeconds(200))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 200){
                Gson gson = new Gson();
                JSONObject jsonObject = new JSONObject(response.body());

                Basis obj = gson.fromJson(String.valueOf(jsonObject), Basis.class);

                System.out.println("It worked!");
                System.out.println(obj.getMost_scored_post_title());
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

}

package com.feelytics.data.collection;

import com.feelytics.data.model.Basis;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.List;

public class APICaller {

    /**
     * Gets the data from the rest API
     * @param query it's what you want to search for, can be any keyword!
     * <p>
     * @since 1.0.1
     * <h4>HUGE data clearing</h4>
     * Because {@code responseBody} comes as a String
     * <p>
     * That's on me, the API server returns the JSON wrapped in quotes, which means
     * it's actually a String, instead of a JSONArray
     * @author gabrielEFagundes
     */
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
                // NOTE: had to clear all this stupid data
                // TODO: fix this mess, even if it means changing the API from the core
                String rawData = response.body().trim();

                while(rawData.startsWith("\"") && rawData.endsWith("\"") && rawData.length() >= 2){
                    rawData = rawData.substring(1, rawData.length()-1);
                }

                String cleanJson = rawData.replace("\\\"", "\"");
                cleanJson = cleanJson.replace('\u00a0', ' ');
                cleanJson = cleanJson.replace("\\n", "").replace("\\t", "").replace("\\", "");

                cleanJson = cleanJson.trim();
                System.out.println(cleanJson);

                Gson gson = new Gson();
                JsonArray obj = JsonParser.parseString(cleanJson).getAsJsonArray();

                obj.forEach(System.out::println);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

}

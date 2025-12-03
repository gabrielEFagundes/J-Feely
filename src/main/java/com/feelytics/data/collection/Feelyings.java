package com.feelytics.data.collection;

import com.google.gson.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Feelyings {

    Gson lenientGson = new GsonBuilder().setLenient().create();
    /**
     * Gets the data from the restAPI
     * @param query it's what you want to search for, can be any keyword!
     * <p>
     * @since 1.0.1
     * <h4>HUGE data clearing</h4>
     * Because {@code responseBody} comes as a String
     * <p>
     * That's on me. The API server returns the JSON wrapped in quotes, which means
     * it's actually a String, instead of a JSONArray
     * @author gabrielEFagundes
     *
     * @since 1.0.2
     * I give up. I really don't know anymore how to make this work without changing the API itself.
     */
    public void getFeelyings(String query){
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
                cleanJson = cleanJson.replaceAll("[^\\p{L}\\p{N}\\p{P}\\[\\]{}:, \"\\s]+", " ");

                cleanJson = cleanJson.trim();
                System.out.println(cleanJson);

//                JsonElement obj = JsonParser.parseString(cleanJson);
//                JsonArray dataArr = obj.getAsJsonArray();
//
//                dataArr = lenientGson.fromJson(cleanJson, JsonArray.class);
//
//                dataArr.forEach(System.out::println);

                // I'm done
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

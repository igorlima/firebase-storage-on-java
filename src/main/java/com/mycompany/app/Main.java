package com.mycompany.app;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> response = Unirest
          .put("https://todo-list-626e4.firebaseio.com/data/6.json")
          .body("{\"id\": 6, \"title\": \"Test 6\"}")
          .asString();
    }
}

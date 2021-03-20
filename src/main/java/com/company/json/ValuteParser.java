package com.company.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class ValuteParser
{
    private String urlString;

    public Valute valutes;
    List <String> allvalute;
    public ValuteParser(String urlString) throws IOException {
        this.urlString = urlString;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        InputStream stream = null;
        stream = UrlStringJson();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(stream));

        allvalute = new ArrayList<>();
        valutes = new Valute();

        ////Да знаю что надо было в список передать все объекты JSON файла, но почему то не получается, даже exception не выдает.
        valutes = gson.fromJson(jsonReader, Valute.class);
        allvalute.add(valutes.toString());

        //Type collectionType = new TypeToken<Collection<Valute_>>(){}.getType();
        //AllValutes valutes = gson.fromJson(jsonReader, collectionType);
        //List<Valute> videos = gson.fromJson(jsonReader, new TypeToken<List<Valute>>(){}.getType());
        //Type listType = new TypeToken<List<Valute>>() {}.getType();
        //Type itemsMapType = new TypeToken<Map<Integer, Valute>>() {}.getType();
        //Map<Integer, Valute> mapItemsDes = new Gson().fromJson(jsonReader, itemsMapType);
        //System.out.println(mapItemsDes.toString());

    }

    /// метод необходим для обновления списка валют
    public InputStream UrlStringJson() throws IOException {

        URL url = new URL(this.urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000 );
        conn.setConnectTimeout(15000 );
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
        return conn.getInputStream();
    }
}

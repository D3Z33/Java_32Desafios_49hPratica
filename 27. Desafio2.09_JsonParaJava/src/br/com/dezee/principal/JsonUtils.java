package br.com.dezee.principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Metodo para converter JSON para Objeto Java
    public static <T> T fromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    // Metodo para converter Objeto Java para JSON
    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }
}
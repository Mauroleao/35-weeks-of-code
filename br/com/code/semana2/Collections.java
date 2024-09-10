package br.com.code.semana2;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        // List
        var notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);

        System.out.println(notas.size());

        // Map 

        var medias = new HashMap<String, Double>();
        medias.put("João", 7.0);
        medias.put("Maria", 8.5);
        medias.put("José", 9.0);

        System.out.println(medias);
    }
    
}

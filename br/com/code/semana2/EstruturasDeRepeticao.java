package br.com.code.semana2;

import java.util.ArrayList;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        
    // while e do while
        var contador = 1;
        while (contador <= 1000) {
        System.out.println("Numero" + contador);
        contador++;
        }

        do { // ele sempre executa uma unica vez para depois parar o codigo
        System.out.println("Numero" + contador);
        contador++;
        } while (contador <= 1000);

    // for
        for (var contador2 = 0; contador2 <= 1000; contador2++) {
            System.out.println("Numero" + contador2);
        }

    // for each
        
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);

        for (var index = 0; index < notas.size(); index++) {
            System.out.println(notas.get(index));
        }

        // for each
        for (Double nota : notas) {
            System.out.println(nota);
        }
    
    }
    
}

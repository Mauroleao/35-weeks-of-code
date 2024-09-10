package br.com.code.semana2;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // if/else
        var idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else if (idade >= 16) {
            System.out.println("Você já pode votar");
        }else {
            System.out.println("Menor de idade");
        }


        var mesDoAno = 2;
        switch (mesDoAno) {
            case 1 -> System.out.println("Janeiro");
            case 2-> System.out.println("Fevereiro");
            case 3-> System.out.println("Outubro");
        }
    }
    
}

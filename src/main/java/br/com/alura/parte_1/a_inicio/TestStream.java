package br.com.alura.parte_1.a_inicio;

import java.util.*;

public class TestStream {
    public static void main(String[] args) {

        List<Integer> asList = new ArrayList<>();

        // adicionando itens em lista
        for (int i = 0; i < 100; i++) {
            asList.add(i);
        }


        for (Integer value : asList) {
            System.out.print(value);
        }

        System.out.println();

        // percorrendo lista de múltiplos de 3
        asList.stream().filter(e -> e % 3 == 0).limit(10).
                forEach(e -> System.out.println(e));

        long quantidadeMultiplos = asList.stream().filter(e -> e % 3 == 0).count();
        System.out.println("Quantidade de múltiplos: " + quantidadeMultiplos);

        Optional<Integer> maxValue = asList.stream().filter(integer -> integer % 3 == 0).min(Comparator.naturalOrder());
        System.out.println("Valor máximo múltiplo: " + maxValue.get());


        System.out.println();
        System.out.println();

        double[] prices = {10, 20, 30, 40, 50};
        double[] newPrices = Arrays.stream(prices).map((price) -> price * 1.1).toArray();

        for (double newPrice : newPrices) {
            System.out.println(newPrice);
        }

        System.out.println();

        Arrays.stream(newPrices).filter(value -> value > 20).forEach(value -> System.out.println(value));


    }
}

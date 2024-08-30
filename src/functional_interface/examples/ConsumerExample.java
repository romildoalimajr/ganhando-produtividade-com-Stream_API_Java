package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        //criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero + " ");
            }
        };
        
        //Usar o Consumer para imprimir números aprs no Stream
        numeros.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer n) {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
        });

        System.out.println();

        numeros.stream().filter(n -> n % 2 == 0)
        .forEach(System.out::println);
    }
}

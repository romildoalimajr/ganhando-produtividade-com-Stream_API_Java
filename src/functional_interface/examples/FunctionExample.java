package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        //Criarr uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,10,25,33);

        //Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        //.map(dobrar)
        /* .map(
            new Function<Integer, Integer> (){
                @Override
                public Integer apply(Integer n){
                    return n * 2;
                }
            }
        )*/
        .map(n -> n * 2)
        //.collect(Collectors.toList());
        .toList();

        //Imprimir a lista de números dobrados
        System.out.println();
        numerosDobrados.forEach(n -> System.out.println(n));
        System.out.println();
        numerosDobrados.forEach(System.out::println);

    }
}

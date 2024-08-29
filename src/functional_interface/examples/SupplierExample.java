package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!!!";

        //Usar o oSupplier para obeter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s));

        System.out.println();

        listaSaudacoes.forEach(System.out::println);
    }
}

package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        //Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> somar = Integer::sum;

        //Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
        //.reduce(0, somar);
        /*.reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n1, Integer n2){
                return n1 + n2;
            }
        });*/
        //.reduce(0, (n1, n2) -> n1 + n2);
        .reduce(0, Integer::sum);

        System.out.println();
        //imprimir o resultado da soma
        System.out.println("A soma dos  números é.: " + resultado);
    }
}

/*
Crie uma variável que irá guardar o valor de um salário.
Calcule a procentagem desse salário, sendo os valores da porcentagem:
 - 30%
 - 15%
 - 5%
A cada vez que você calcular, guarde o resultado em uma variável.
Imprima o resultado e reutilize a variável que guarda o resultado para o novo cálculo.
 */

public class ReutilizandoVariaveis {
    public static void main(String[] args) {

        double salario = 800;

        double resultado = salario * 0.3;
        System.out.println(resultado);

        // Em resumo, a ideia aqui é que com a reutilização de variáveis, não será necessário declarar mais variáveis com nomes diferentes.
        // Se fôssemos colocar "double", a palavra "resultado" deveria vir acompanhado de algo que a diferenciasse da palavra "resultado" utilizada anteriormente.
        resultado = salario * 0.15;
        System.out.println(resultado);

        resultado = salario * 0.05;
        System.out.println(resultado);
    }
}

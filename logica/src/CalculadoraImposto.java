/*
Crie uma classe que calcule uma determinada porcentagem de um dado salário.
1. Criar uma classe.
2. Aceitar um valor de entrada para o salário.
3. Definir o valor da porcentagem.
4. Calcular a porcentagem.
*/

public class CalculadoraImposto {
    public static void main(String[] args) {

        // No Java, sempre que for declarar um float, deve-se colocar o F ou L ao final antes do ;. Caso não seja colocado, o compilador irá entender que a variável será um double.
        float salario = 1200.00F;
        float porcentagem = 0.1F;

        float calculo = salario * porcentagem;

        System.out.println(calculo);
    }
}

public class TestandoVariaveis {
    public static void main(String[] args) {

        // Quando se declara char, não pode ser colocado mais que um caractere.
        // E a variável deve receber a informação com aspas simples: '
        char letra = 'A';
        System.out.println(letra);

        // Quando se declara String, você pode guardar mais que uma letra, até mesmo nomes inteiros e frases.
        // E a variável deve receber a informação com aspas dupla: "
        // String é o ÚNICO tipo de variável que pode ser declarado com letra maiúscula.
        String nome = "João Pedro Martins";
        System.out.println(nome);

        // No Java não se pode declarar Boolean atribuindo apenas 0 (para falso) e 1 (para verdadeiro), como é feito em outras linguagens.
        // Deve-se escrever "false" ou "true"
        boolean condicao = true;
        System.out.println(condicao);
    }
}

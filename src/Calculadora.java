import java.util.Scanner;
    // Futuras atualizações previstas:
        // - Validadores que checarão se as informações que o usuário insere estão corretas
        // - Estrutura de repetição para realizar mais cálculos
        // - Melhorias gerais ao menu

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Menu
        System.out.println("Calculadora");
        System.out.println("Selecione o símbolo da operação matemática desejada");
        System.out.println("+ > soma\n- > subtração\n* > multiplicação\n/ > divisão");
        char operacao = leitor.next().charAt(0); // Armazenando a operacao escolhida em uma variável
        System.out.println("Digite o primeiro número");
        double primeiroNumero = leitor.nextDouble(); // Armazenando primeiro número
        System.out.println("Digite o segundo número");
        double segundoNumero = leitor.nextDouble(); // Armazenando segundo número

        // Instanciando o objeto calculo
        Calculos calculo = new Calculos(primeiroNumero, segundoNumero);

        // Estrutura de decisão que se baseará na operação escolhida pelo usuário
        if(operacao == '+'){
            calculo.soma(); // Efetuando o cálculo para atualizarmos o resultado
            // Estrutura de decisão, que a partir do resultado do cálculo, eliminará ou não as casas decimais.
            if (calculo.resultado % 1 == 0) {
                System.out.println(calculo.somaFormatada()); // Exemplificadamente, se o resultado for 2, ele exibirá
        }                                                    // 2 e não 2.0 (por se tratar de uma variável double).
            else {
                System.out.println("O resultado é: " + calculo.soma());
            }
        }
        // O mesmo conceito se aplica a todas as demais operações
        else if (operacao == '-'){
            calculo.subtracao();
            if (calculo.resultado % 1 == 0) {
                System.out.println(calculo.subtracaoFormatada());
            }
            else {
                System.out.println("O resultado é: " + calculo.subtracao());
            }
        }
        else if (operacao == '*'){
            calculo.multiplicacao();
            if (calculo.resultado % 1 == 0) {
                System.out.println(calculo.multiplicacaoFormatada());
            }
            else {
                System.out.println("O resultado é: " + calculo.multiplicacao());
            }
        }
        else if (operacao == '/'){
            calculo.divisao();
            if (calculo.resultado % 1 == 0) {
                System.out.println(calculo.divisaoFormatada());
            }
            else {
                System.out.println("O resultado é: " + calculo.divisao());
            }
        }




    }
}

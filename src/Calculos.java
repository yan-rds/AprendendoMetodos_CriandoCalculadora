public class Calculos {
    double primeiroNumero;
    double segundoNumero;
    double resultado;

    public Calculos(double primeiroNumero, double segundoNumero){
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    // Métodos responsáveis pelo cálculo

    double soma(){
        return resultado = (primeiroNumero + segundoNumero);
    }
    double subtracao(){
        return resultado = (primeiroNumero - segundoNumero);
    }
    double multiplicacao(){
        return resultado = (primeiroNumero * segundoNumero);
    }
    double divisao(){
        return resultado = primeiroNumero / segundoNumero;
    }

    // Métodos que formatarão as casas decimais dos métodos acima

    String somaFormatada () {
        return String.format("O resultado é %.0f", soma());
    }
    String subtracaoFormatada (){
        return String.format("O resultado é %.0f" , subtracao());
    }
    String multiplicacaoFormatada (){
        return String.format("O resultado é %.0f" , multiplicacao());
    }
    String divisaoFormatada (){
        return String.format("O resultado é %.0f" , divisao());
    }
}

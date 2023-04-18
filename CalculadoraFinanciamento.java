public class CalculadoraFinanciamento {

public static void main (String [] args) {
    int valorDoCarro = 10000;
    int duracaoDoEmprestimo = 3; // anos
    int taxaDeJuros = 5; // %
    int valorEntrada = 2000;

    if (duracaoDoEmprestimo <= 0 || taxaDeJuros <= 0) {
        System.out.println ("Erro! você deve fazer um empréstimo válido.");
    } 
    else if (valorEntrada >= valorDoCarro) {
        System.out.println ("O carro pode ser pago integralmente.");
    }

    else {
        int saldoRestante = valorDoCarro - valorEntrada;
        int numeroDeMeses = duracaoDoEmprestimo * 12;
        int saldoMensal = saldoRestante / numeroDeMeses;
        int juros = saldoMensal * taxaDeJuros / 100;
        int pagamentoMensal = saldoMensal + juros;

        System.out.println (pagamentoMensal);
    }
  }
}
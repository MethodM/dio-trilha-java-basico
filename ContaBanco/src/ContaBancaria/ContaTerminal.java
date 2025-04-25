package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        do {
            System.out.println("Por favor, digite o Número da Conta!");
            numero = scanner.nextInt();
            scanner.nextLine();

            if (numero <= 0) {
                System.out.println("Número inválido, tente novamente!");
            }
        } while(numero <= 0);

        String agencia;
        do {
            System.out.println("Por favor, digite o Número da Agência!");
            agencia = scanner.next();
            if (agencia.trim().isEmpty()) { //trim() exlui campos vazios, isEmpty
                System.out.println("Agencia inválida, tente novamente!");
            }
        } while(agencia.trim().isEmpty());
        scanner.nextLine();

        String nomeCliente;
        do {
            System.out.println("Por gentileza, insira seu Nome completo!");
            nomeCliente = scanner.nextLine(); // limpar o buffer e evitar erro na declaração de tipo diferente
        } while(nomeCliente.trim().isEmpty()); // Métodos do 'String'

        // Precisa da variável local para armazenar o valor digitado pelo usuário
        double saldo;
        do {
            System.out.println("Digite o valor de deposito: ");
            saldo = scanner.nextDouble();
            if (saldo < 0) {
                System.out.println("Saldo inválido, digite novamente por favor!");
            }
        } while(saldo < 0);

        ContaBanco contaBanco = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.println("O Saldo atual é: " + contaBanco.getSaldo());
        if(contaBanco.getSaldo() <= 0){
            System.out.println("Saque recusado. O saldo é negativo: R$ " + String.format("%.2f", contaBanco.getSaldo()));
        } else {
            System.out.println(contaBanco.mensagemAoCliente());
        }
    }

}

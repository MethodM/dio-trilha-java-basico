package ContaBancaria;

public class ContaBanco {
    //Atributos da classe
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Getters e Setters - Segurança do código
    public int getNumero() {
        return numero;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){ //necessário parâmetro
        this.saldo = saldo;
    }

    public String mensagemAoCliente() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco, " +
                "sua Agência é: " + agencia + ", Conta " + numero + " e seu Saldo de R$" + saldo +
                ", já está disponível para saque.";
    }
    //Construtor para aceitar parâmetros
    public ContaBanco(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
}

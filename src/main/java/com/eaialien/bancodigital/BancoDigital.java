package com.eaialien.bancodigital;

public class BancoDigital {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Silva", "123.456.789-00");

        ContaCorrente cc = new ContaCorrente(1, 1001, cliente1);
        ContaPoupanca cp = new ContaPoupanca(1, 1002, cliente1);

        cc.depositar(500);
        cc.transferir(200, cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + cp.getSaldo());
        }
}

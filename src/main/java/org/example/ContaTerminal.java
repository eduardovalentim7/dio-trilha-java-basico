package org.example;


import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
     /*
     * Atributos:
     * Numero da Conta - Integer
     * Agencia - String
     * NomeCliente - String
     * Saldo - Double
     * */

        String texto1 =", obrigado por criar uma conta em nosso banco, sua agência é ";

        var scanner = new Scanner(System.in);

        System.out.print("Por Favor, digite o nome: ");
        var nome = scanner.nextLine();

        System.out.print("Por Favor, digite o numero da Agencia: ");
        var agencia = scanner.nextLine();

        System.out.print("Por Favor, digite o numero da Conta: ");
        var conta = scanner.nextInt();

        System.out.print("Por Favor, digite o saldo da Conta: ");
        var saldo = scanner.nextFloat();


        System.out.println("Olá " +nome.concat(texto1) +agencia+ " conta " +conta+ " e seu saldo é " +saldo+ " já está disponível para saque");

    }
}
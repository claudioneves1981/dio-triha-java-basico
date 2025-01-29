package main;

import model.Cliente;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.print("Por favor, digite o número da Conta! --> ");
        cliente.setNumero(entrada.nextInt());
        System.out.print("Por favor, digite o número da Agencia! --> ");
        cliente.setAgencia(entrada.next());
        System.out.print("Por favor, digite seu nome completo --> ");
        cliente.setNomeCliente(entrada.next());
        System.out.print("Por favor, digite o saldo --> ");
        cliente.setSaldo(entrada.nextDouble());


        System.out.println("Olá "+cliente.getNomeCliente()+" obrigado por criar uma conta em nosso banco, sua agência é "+ cliente.getAgencia()+" conta "+ cliente.getNumero()+" e seu saldo "+cliente.getSaldo()+" já está disponível para saque");



    }

}

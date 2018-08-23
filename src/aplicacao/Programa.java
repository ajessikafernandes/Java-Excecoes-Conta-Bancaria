package aplicacao;

import java.text.ParseException;

import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.ContaBancaria;
import modelo.execao.TratamentoExecao;

public class Programa {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com os dados da conta Bancária: ");
		System.out.print("Número da conta: ");
		int numero = ler.nextInt();
		System.out.print("Nome da conta: ");
		ler.nextLine();
		String nome = ler.nextLine();
		System.out.print("Deposito inicial na conta: ");
		double saldo = ler.nextDouble();
		System.out.print("Limite de Saque da conta: ");
		double limite = ler.nextDouble();

		ContaBancaria conta = new ContaBancaria(numero, nome, saldo, limite);

		System.out.println();
		System.out.print("Informe o valor para saque da conta: ");
		double valor = ler.nextDouble();

		
		try {
			conta.retirarSaldo(valor);
			System.out.println("Saldo da conta: " + String.format("%.2f", conta.getSaldo()));

		}

		catch (TratamentoExecao a) {
			System.out.println("Erro: " + a.getMessage());
		}

		ler.close();
	}

}

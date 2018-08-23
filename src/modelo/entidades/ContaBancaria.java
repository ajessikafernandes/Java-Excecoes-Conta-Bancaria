package modelo.entidades;

import modelo.execao.TratamentoExecao;

public class ContaBancaria {

	private Integer numero;
	private String nome;
	private Double saldo;
	private double limite;

	public ContaBancaria(Integer numero, String nome, Double saldo, double limite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;

	}

	public Integer getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void adicionarSaldo(double valor) {
		// adiciona saldo a conta;
		saldo += valor;
	}

	public void retirarSaldo(double valor) {
		// Caso o valor da conta seja menor que o limite
		if (valor > limite) {
			throw new TratamentoExecao ("Valor para saque excedeu o Limite da Conta.");
		}

		// caso o valor de saldo da conta seja insuficiente
		if (valor < saldo) {
			throw new TratamentoExecao ("Saldo insuficiente.");
		}

		saldo -= valor;

	}

}

package com.dio.bootcamp.santander;

import com.dio.bootcamp.santander.classes.IPhone;

public class Main {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();

		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();

		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();

		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}
}
package com.dio.bootcamp.santander.classes;

import com.dio.bootcamp.santander.interfaces.NavegadorInternet;

public class GoogleChrome implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
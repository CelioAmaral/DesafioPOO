package com.dio.bootcamp.santander.classes;

import com.dio.bootcamp.santander.interfaces.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Aparelho fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Iniciado");
    }
}
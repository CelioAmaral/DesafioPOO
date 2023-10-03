package com.dio.bootcamp.santander.classes;

import com.dio.bootcamp.santander.interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
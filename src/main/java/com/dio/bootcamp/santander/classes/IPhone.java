package com.dio.bootcamp.santander.classes;

import com.dio.bootcamp.santander.interfaces.AparelhoTelefonico;
import com.dio.bootcamp.santander.interfaces.NavegadorInternet;
import com.dio.bootcamp.santander.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private Phone phone;
    private Ipod ipod;
    private GoogleChrome googlechrome;

    public IPhone() {
        phone = new Phone();
        ipod = new Ipod();
        googlechrome = new GoogleChrome();
        System.out.println("IPhone funcionando");
    }

    @Override
    public void ligar() {
        phone.ligar();
    }

    @Override
    public void atender() {
        phone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        phone.iniciarCorreioVoz();
    }

    @Override
    public void tocar() {
        ipod.tocar();
    }

    @Override
    public void pausar() {
        ipod.pausar();
    }

    @Override
    public void selecionarMusica() {
        ipod.selecionarMusica();
    }

    @Override
    public void exibirPagina() {
        googlechrome.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        googlechrome.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        googlechrome.atualizarPagina();
    }
}
package model;

import java.util.ArrayList;
import java.util.Random;

public class Roleta {
    private ArrayList<Integer> numeros;
    private int quantidadeFaltante;
    private int ordem;
    private Random gerador;

    public Roleta() {
        numeros = new ArrayList<>();
        gerador = new Random();
        quantidadeFaltante = 0;
        ordem = 0;
    }

    public boolean iniciar(int quantidade) {
        if (quantidade <= 0) return false;

        numeros.clear();
        for (int i = 1; i <= quantidade; i++) {
            numeros.add(i);
        }
        quantidadeFaltante = quantidade;
        ordem = 0;
        return true;
    }

    public boolean temNumeros() {
        return !numeros.isEmpty();
    }

    public int getQuantidadeFaltante() {
        return quantidadeFaltante;
    }

    public int getOrdem() {
        return ordem;
    }

    public int sortear() {
        if (temNumeros()) {
            int indice = gerador.nextInt(quantidadeFaltante);
            int numeroSorteado = numeros.get(indice);
            numeros.remove(indice);
            quantidadeFaltante--;
            ordem++;
            return numeroSorteado;
        }
        throw new IllegalStateException("Não há mais números para sortear.");
    }
}
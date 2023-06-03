package Models;

import Models.Enumerations.CategoriaPesoMasculino;
import Models.Enumerations.EscalaoEtario;

import java.util.LinkedList;

public class ProvaMasculino extends Prova{

    private CategoriaPesoMasculino categoriaPeso;

    public ProvaMasculino(Evento evento, EscalaoEtario escalao, LinkedList<Atleta> atletas, CategoriaPesoMasculino categoriaPeso) {
        super(evento, escalao, atletas);
        this.categoriaPeso = categoriaPeso;
    }

    public CategoriaPesoMasculino getCategoriaPeso() {
        return categoriaPeso;
    }
}

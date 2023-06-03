package Models;

import Models.Enumerations.CategoriaPesoFeminino;
import Models.Enumerations.EscalaoEtario;

import java.util.LinkedList;

public class ProvaFeminino extends Prova {
    private final CategoriaPesoFeminino categoriaPeso;

    public ProvaFeminino(Evento evento, EscalaoEtario escalao, LinkedList<Atleta> atletas, CategoriaPesoFeminino categoriaPeso) {
        super(evento, escalao, atletas);
        this.categoriaPeso = categoriaPeso;
    }

    public CategoriaPesoFeminino getCategoriaPeso() {
        return categoriaPeso;
    }
}

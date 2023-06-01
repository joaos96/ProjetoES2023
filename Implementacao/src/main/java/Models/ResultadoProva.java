package Models;

import Models.Enumerations.TipoMedalha;

import java.util.LinkedList;

public class ResultadoProva {
    private Prova prova;
    private TipoMedalha medalha;
    private LinkedList<Combate> combates;

    public ResultadoProva(Prova prova, TipoMedalha medalha, LinkedList<Combate> combates) {
        this.prova = prova;
        this.medalha = medalha;
        this.combates = combates;
    }

    public Prova getProva() {
        return prova;
    }

    public TipoMedalha getMedalha() {
        return medalha;
    }

    public LinkedList<Combate> getCombates() {
        return combates;
    }
}

package Models;

import java.util.LinkedList;

public class ResultadoProva {
    private Prova prova;
    private Medalha medalha;
    private LinkedList<Combate> combates;

    public ResultadoProva(Prova prova, Medalha medalha, LinkedList<Combate> combates) {
        this.prova = prova;
        this.medalha = medalha;
        this.combates = combates;
    }

    public Prova getProva() {
        return prova;
    }

    public Medalha getMedalha() {
        return medalha;
    }

    public LinkedList<Combate> getCombates() {
        return combates;
    }
}

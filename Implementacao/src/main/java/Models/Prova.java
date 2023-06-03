package Models;

import Models.Enumerations.EscalaoEtario;
import Models.Enumerations.Fase;
import Models.Enumerations.TipoMedalha;

import java.util.HashMap;
import java.util.LinkedList;

public abstract class Prova {
    private final Evento evento;
    private final EscalaoEtario escalao;
    private final LinkedList<Atleta> atletas;
    private final HashMap<Fase, LinkedList<Combate>> fases;
    private final HashMap<TipoMedalha, Atleta> medalhas;

    public Prova(Evento evento, EscalaoEtario escalao, LinkedList<Atleta> atletas) {
        this.evento = evento;
        this.escalao = escalao;
        this.atletas = atletas;
        fases = new HashMap<>(); //aqui as fases podiam geradas automaticamente...
        medalhas = new HashMap<>();
    }

    public Evento getEvento() {
        return evento;
    }

    public EscalaoEtario getEscalao() {
        return escalao;
    }

    public LinkedList<Atleta> getAtletas() {
        return atletas;
    }

    public HashMap<Fase, LinkedList<Combate>> getFases() {
        return fases;
    }

    public HashMap<TipoMedalha, Atleta> getMedalhas() {
        return medalhas;
    }
}

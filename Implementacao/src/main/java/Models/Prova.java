package Models;

import Models.Enumerations.EscalaoEtario;
import Models.Enumerations.Fase;
import Models.Enumerations.TipoMedalha;

import java.util.HashMap;
import java.util.LinkedList;

public abstract class Prova {
    private Evento evento;
    private EscalaoEtario escalao;
    private LinkedList<Atleta> atletas;
    private HashMap<Fase, LinkedList<Combate>> fases;
    private HashMap<TipoMedalha, Atleta> medalhas;

    public Prova(Evento evento, EscalaoEtario escalao, LinkedList<Atleta> atletas) {
        this.evento = evento;
        this.escalao = escalao;
        atletas = atletas;
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

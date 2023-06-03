package Models;

import Models.Enumerations.EscalaoEtario;
import Models.Enumerations.Fase;
import Models.Enumerations.TipoMedalha;

import java.util.HashMap;
import java.util.LinkedList;

public class Prova {
    private Evento evento;
    private HashMap<Fase, LinkedList<Combate>> fases;
    private EscalaoEtario escalao;
    private LinkedList<Atleta> atletas;
    private HashMap<TipoMedalha, Atleta> medalhas;
}

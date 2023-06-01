package Models;

import Models.Enumerations.EscalaoEtario;

import java.util.HashMap;

public class Prova {
    private Evento evento;
    private HashMap<Fase, List<Combate>> fases;
    private EscalaoEtario escalao;
    private List<Atleta> atletas;
    private HashMap<TipoMedalha, Atleta> medalhas;
}

package Models;

import Models.Enumerations.CategoriaPesoFeminino;
import Models.Enumerations.CategoriaPesoMasculino;
import Models.Enumerations.EscalaoEtario;
import Models.Enumerations.Genero;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Evento {
    private Date dataInicio;
    private Date dataFim;
    private String nome;
    private String local;
    private String pais;
    private List<Inscricao> inscritos;
    private HashMap<EscalaoEtario, HashMap<CategoriaPesoMasculino, ProvaMasculino>> provasMasculinas;
    private HashMap<EscalaoEtario, HashMap<CategoriaPesoFeminino, ProvaFeminino>> provasFemininas;

}

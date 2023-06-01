package Models;

import Models.Enumerations.EscalaoEtario;
import Models.Enumerations.Genero;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Evento {
    private Date dataInicio;
    private Date dataFim;
    private String nome;
    private String local;
    private String pais;
    private List<Inscricao> inscritos;
    private HashMap<Genero, HashMap<EscalaoEtario, Prova>> provas;









}

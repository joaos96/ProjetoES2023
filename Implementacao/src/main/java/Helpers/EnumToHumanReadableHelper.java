package Helpers;

import Models.Enumerations.*;
import javax.naming.OperationNotSupportedException;

public final class EnumToHumanReadableHelper
{
    public static String Convert(CategoriaPesoFeminino categoriaPesoFeminino) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (categoriaPesoFeminino){
            case MENOS45 -> humanReadable = "Menos 45";
            case MENOS48 -> humanReadable = "Menos 48";
            case MENOS52 -> humanReadable = "Menos 52";
            case MENOS57 -> humanReadable = "Menos 57";
            case MENOS63 -> humanReadable = "Menos 63";
            case MENOS70 -> humanReadable = "Menos 70";
            case MAIS70  -> humanReadable = "Mais 70";
            default      -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }

    public static String Convert(CategoriaPesoMasculino categoriaPesoMasculino) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (categoriaPesoMasculino)
        {
            case MENOS56 -> humanReadable = "Menos 56";
            case MENOS62 -> humanReadable = "Menos 62";
            case MENOS69 -> humanReadable = "Menos 69";
            case MENOS77 -> humanReadable = "Menos 77";
            case MENOS85 -> humanReadable = "Menos 85";
            case MENOS94 -> humanReadable = "Menos 94";
            case MAIS94  -> humanReadable = "Mais 94";
            default      -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }

    public static String Convert(Cinturao cinturao) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (cinturao)
        {
            case BRANCO   -> humanReadable = "Branco";
            case AZUL     -> humanReadable = "Azul";
            case ROXO     -> humanReadable = "Roxo";
            case CASTANHO -> humanReadable = "Castanho";
            case PRETO    -> humanReadable = "Preto";
            case VERMELHO -> humanReadable = "Vermelho";
            default       -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }

    public static String Convert(EscalaoEtario escalaoEtario) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (escalaoEtario)
        {
            case JUNIOR   -> humanReadable = "Junior";
            case ADULTO   -> humanReadable = "Adulto";
            case SENIOR   -> humanReadable = "Senior";
            default       -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }

    public static String Convert(Fase fase) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (fase)
        {
            case DEZASSEISAVOSFINAL   -> humanReadable = "Dezasseis Avos de Final";
            case OITAVOSFINAL         -> humanReadable = "Oitavos de Final";
            case QUARTOSFINAL         -> humanReadable = "Quartos de Final";
            case SEMIFINAL            -> humanReadable = "Semifinal";
            case DISPUTAMEDALHABRONZE -> humanReadable = "Disputa para a Medalha de Bronze";
            case FINAL                -> humanReadable = "Final";
            default                   -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }

    public static String Convert(Genero genero) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (genero)
        {
            case MASCULINO -> humanReadable = "Masculino";
            case FEMININO  -> humanReadable = "Feminino";
            default        -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }

    public static String Convert(TipoMedalha tipoMedalha) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (tipoMedalha)
        {
            case BRONZE -> humanReadable = "Medalha de Bronze";
            case PRATA  -> humanReadable = "Medalha de Prata";
            case OURO   -> humanReadable = "Medalha de Ouro";
            default     -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }

    public static String Convert(TipoVitoria tipoVitoria) throws OperationNotSupportedException {
        String humanReadable = "";
        switch (tipoVitoria)
        {
            case PONTOS           -> humanReadable = "Vitória por Pontos";
            case SUBMISSAO        -> humanReadable = "Vitória por Submissão";
            case DESCLASSIFICACAO -> humanReadable = "Vitória de Desclassicação do Oponente";
            case DECISAOARBITRO   -> humanReadable = "Vitória por Decisão do Árbitro";
            case TAPETEIMCOMPLETO -> humanReadable = "Tapete Incompleto";
            default               -> throw new OperationNotSupportedException();
        }
        return humanReadable;
    }
}

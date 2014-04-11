/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoffresstage;

import java.io.Serializable;

/**
 *
 * @author kilavuz
 */
public class OffreStage implements Serializable {
    
    private Entreprise Entreprise;
    private String libelléOffre;
    private String domaineOffre;
    private String dateDébutOffre;
    private String duréeOffre;
    private String cheminOffre;
    private String desciptifOffre;
    //private double valide;
    //Constructeur de la classe OffreStage
    public OffreStage(Entreprise Entreprise,String libelléOffre, String domaineOffre,
            String dateDébutOffre, String duréeOffre, 
            String cheminOffre,String desciptifOffre) {
        this.Entreprise = Entreprise;
        this.libelléOffre = libelléOffre;
        this.domaineOffre = domaineOffre;
        this.dateDébutOffre = dateDébutOffre;
        this.duréeOffre = duréeOffre;
        this.cheminOffre = cheminOffre;
        this.desciptifOffre = desciptifOffre;
        
    }
    // Getter et Setter
    public Entreprise getEntreprise(){
        return Entreprise;
        
    }
    
    public void setEntreprise(Entreprise Entreprise){
        this.Entreprise= Entreprise;
    }
    public String getLibelléOffre() {
        return libelléOffre;
    }

    public void setLibelléOffre(String libelléOffre) {
        this.libelléOffre = libelléOffre;
    }

    public String getDesciptifOffre() {
        return desciptifOffre;
    }

    public void setDesciptifOffre(String desciptifOffre) {
        this.desciptifOffre = desciptifOffre;
    }

    public String getDomaineOffre() {
        return domaineOffre;
    }

    public void setDomaineOffre(String domaineOffre) {
        this.domaineOffre = domaineOffre;
    }

    public String getDateDébutOffre() {
        return dateDébutOffre;
    }

    public void setDateDébutOffre(String dateDébutOffre) {
        this.dateDébutOffre = dateDébutOffre;
    }

    public String getDuréeOffre() {
        return duréeOffre;
    }

    public void setDuréeOffre(String duréeOffre) {
        this.duréeOffre = duréeOffre;
    }

    public String getCheminOffre() {
        return cheminOffre;
    }

    public void setCheminOffre(String cheminOffre) {
        this.cheminOffre = cheminOffre;
    }

  
}

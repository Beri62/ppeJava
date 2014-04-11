 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoffresstage;

/**
 *
 * @author kilavuz
 */
public class Entreprise {
    
    private String nom;
    private String adresseRueEntreprise;
    private String adresseCodePostalEntreprise;
    private String adresseVilleEntreprise;
    private String mailEntreprise;
    private String telEntreprise;
    private String secteurActivité;

    // Constructeur de la classe Entreprise
    
    public Entreprise(String nom,String adresseRueEntreprise,
            String adresseCodePostalEntreprise,String adresseVilleEntreprise,
            String telEntreprise, String mailEntreprise,String secteurActivité) {
        this.nom = nom;
        this.adresseRueEntreprise = adresseRueEntreprise;
        this.adresseCodePostalEntreprise = adresseCodePostalEntreprise;
        this.adresseVilleEntreprise = adresseVilleEntreprise;
        this.mailEntreprise = mailEntreprise;
        this.telEntreprise = telEntreprise;
        this.secteurActivité = secteurActivité;
    }
    
    
    // Getter et Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
  
  

    public String getAdresseVilleEntreprise() {
        return adresseVilleEntreprise;
    }

    public void setAdresseVilleEntreprise(String adresseVilleEntreprise) {
        this.adresseVilleEntreprise = adresseVilleEntreprise;
    }

    public String getAdresseRueEntreprise() {
        return adresseRueEntreprise;
    }

    public void setAdresseRueEntreprise(String adresseRueEntreprise) {
        this.adresseRueEntreprise = adresseRueEntreprise;
    }

    public String getAdresseCodePostalEntreprise() {
        return adresseCodePostalEntreprise;
    }

    public void setAdresseCodePostalEntreprise(String adresseCodePostalEntreprise) {
        this.adresseCodePostalEntreprise = adresseCodePostalEntreprise;
    }

    public String getMailEntreprise() {
        return mailEntreprise;
    }

    public void setMailEntreprise(String mailEntreprise) {
        this.mailEntreprise = mailEntreprise;
    }

    
    public String getTelEntreprise() {
        return telEntreprise;
    }

    public void setTelEntreprise(String telEntreprise) {
        this.telEntreprise = telEntreprise;
    }

    public String getSecteurActivité() {
        return secteurActivité;
    }

    public void setSecteurActivité(String secteurActivité) {
        this.secteurActivité = secteurActivité;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetoffresstage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;



/**
 *
 * @author kilavuz
 */
public class MainProjet {

 
    // Declaration de nos collections
    public static ArrayList<OffreStage> lesOffres = new ArrayList ();
    public static ArrayList<Entreprise> lesEntreprises = new ArrayList ();
            
    public static void main(String[] args) {
        //Serialisation
        try
            {
                FileInputStream f = new FileInputStream("sauvegarde.csv");
                ObjectInputStream s = new ObjectInputStream(f);
                lesEntreprises = (ArrayList) s.readObject(); 
                lesOffres = (ArrayList) s.readObject();
                }
                catch(IOException e) {System.out.println("Nouveau fichier");}
                catch(ClassNotFoundException e) {System.out.println("Probleme");}
                MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);
    }
    
}

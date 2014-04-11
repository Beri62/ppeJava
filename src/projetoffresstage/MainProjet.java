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
    public static ArrayList<OffreStage> lesOffres = new ArrayList<OffreStage> ();
    public static ArrayList<Entreprise> lesEntreprises = new ArrayList<Entreprise> ();
            
    public static void main(String[] args) {


                MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);
    }
}

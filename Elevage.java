import java.util.ArrayList;

public class Elevage{

    // Attributs
    private Legume[] potager;
    private Animal[] enclos;
    private int cptL = 0;
    private int cptA = 0;
    private static final int TAILLE_MAX = 10;
    private static int nbJournee = 0;
    private ArrayList <Aliment> ressources = new ArrayList < Aliment > ();
    private int cptPatate = 0;
    private int cptCarotte = 0;
    private int cptLait = 0;
    private int cptOeuf = 0;

    // Constructeur
    public Elevage(){
        potager = new Legume[TAILLE_MAX];
        enclos = new Animal[TAILLE_MAX];
    }

    //Méthodes 

    public void ajouterLegume(Legume l) throws TabPleinException {
        if( cptL < potager.length){
            potager[cptL] = l;
            cptL++;
        }
        else{
            throw new TabPleinException("Le potager est plein !");
        }
    }

    public void ajouterAnimal(Animal a) throws TabPleinException {
        if( cptA < enclos.length){
            enclos[cptA] = a;
            cptA++;
        }
        else{
            throw new TabPleinException("L'enclos est plein !");
        }
    }

    // Cette methode permet de simuler une journee dans laquelle nos animaux et nos legumes se developpent 
    public void journee(){
		for(int i = 0; i < TAILLE_MAX  ;i++){

            if(potager[i] != null){
                potager[i].croissance();
            }
            if(enclos[i] != null){
                enclos[i].croissance();
            }
		}
        nbJournee++;
	}

    public static int getJournee(){
        return nbJournee;
    }

    // Cette méthode renvoie le nombre total de calories de nos ressources en fonction des aliments recoltes 

    public int totalCalories(){
        int res = 0;
        for(Aliment a : ressources){
            res = res + a.getCalorie();
        }
        return res;
    }
 
    // cette methode va permttre de simuler une recole
    public void recolte(){
        for(int i = 0; i < TAILLE_MAX  ; i++){
            // Si un legume est en etat d'etre recoltable on l'ajoute aux ressources et on replante un legume
            if( potager[i] != null && potager[i].peutProduire() ){
                ressources.add(potager[i].clone());
                if(potager[i] instanceof Patate){
                    cptPatate++;
                }
                else{
                    cptCarotte++;
                }
                System.out.println(potager[i].toString()+ " a ete recolte");
                potager[i].replanter();
            }
             // Si un animal est en etat de produire un aliment on l'ajoute aux ressources
            if( enclos[i] != null && enclos[i].peutProduire() ){
                ressources.add(enclos[i].produire());
                if(enclos[i] instanceof Vache){
                    cptLait++;
                }
                else{
                    cptOeuf++;
                }
                System.out.println(enclos[i].toString()+ " a produit : " + enclos[i].produire().toString() );
            }
            // Lors de notre recolte on imagine qu'un animal peut se reproduire avec une probabilite probReproduction
            if(enclos[i] != null && ( Math.random() < enclos[i].getprobReproduction() ) ){
                System.out.println(enclos[i].toString() + " s'est reproduit !");
                try{
                this.ajouterAnimal(enclos[i].clone());
                }
                catch(TabPleinException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    } 

    public String toString(){
        String s = "";
        s = s + "             ==================================================================            \n";
        s = "JOURNEE : " + nbJournee + "\n";
        s = s + "Notre elevage : \n";
        s = s + "\n\n";
        for(int i = 0; i < TAILLE_MAX; i++){
            if(potager[i] != null){
                if(potager[i] instanceof Patate){
                    if(potager[i].peutProduire()){
                        s = s + "--PATATE!--";
                    }
                    else{
                        s = s + "--patate--";
                    }
                }
                if(potager[i] instanceof Carotte){
                    if(potager[i].peutProduire()){
                        s = s + "--CAROTTE!--";
                    }
                    else{
                        s = s + "--carotte--";
                    }
                }
            }
            else{
                s = s + " ";
            }
        }
        s = s + "\n\n";
        for(int i = 0; i < TAILLE_MAX; i++){
            if(enclos[i] != null){
                if(enclos[i] instanceof Vache){
                    if(enclos[i].peutProduire()){
                        s = s + "--VACHE!--";
                    }
                    else{
                        s = s + "--vache--";
                    }
                }
                if(enclos[i] instanceof Poule){
                    if(enclos[i].peutProduire()){
                        s = s + "--POULE!--";
                    }
                    else{
                        s = s + "--poule--";
                    }
                }
            }
            else{
                s = s + " ";
            }
        }
        s = s + "\n\n";
        s = s + "Nous avons " + cptL + " legumes dans le potager et " + cptA + " animaux dans l'enclos \n";
        s = s + "ressources acutelles : \n";
        s = s + "Patates: " + cptPatate + " Carottes: "+ cptCarotte + " Bouteilles de Lait: " + cptLait + " Oeufs : "+ cptOeuf + "\n";
        s = s + "Total calories :" + this.totalCalories() + "\n";
        s= s + "             ==================================================================            ";
        s = s + "\n\n";
        return s;
    }  
}



public class Patate extends Legume{
    //Constructeur
    public Patate(){
        super(80,1,4);
    }

    //Methodes 

    //Cette methode vérifie si la patate peut être recoltable
    public boolean peutProduire(){
        boolean b = this.compteurJourCroissance >= jourCroissance;
        if(b==false){
            System.out.println(this.toString() + "n'est pas encore mure sera recoltable dans " + (jourCroissance - this.compteurJourCroissance ) + " jours.\n");
        }
        return b;
    }
    //Cette fonction augmente la croisance de la patate d'une journée

    public void croissance(){
        if(compteurJourCroissance < jourCroissance ) {
            compteurJourCroissance++;
        }
    }

    public Patate clone(){
        return new Patate();
    }
    
    public String toString(){
        return "une patate ";
    }
}


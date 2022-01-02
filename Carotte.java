public class Carotte extends Legume{
    //Constructeur
    public Carotte(){
        super(80,1,2);
    }

    //Methodes 

    //Cette methode vérifie si la carotte peut être recoltable
    public boolean peutProduire(){
        boolean b = this.compteurJourCroissance >= jourCroissance;
        if(b==false){
            System.out.println(this.toString() + "n'est pas encore mure sera recoltable dans " +  (jourCroissance - this.compteurJourCroissance ) +" jours. \n");
        }
        return b;
    }
    
    //Cette fonction augmente la croisance de la carotte d'une journée
    public void croissance(){
        if(compteurJourCroissance < jourCroissance){
            compteurJourCroissance++;
        }
    }

    public Carotte clone(){
        return new Carotte();
    }

    public String toString(){
        return "une carotte ";
    }
}
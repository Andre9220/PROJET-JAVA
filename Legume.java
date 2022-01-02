public abstract class Legume extends Aliment implements Agriculteur{
    protected int compteurJourCroissance; // compteur nombre de jour de croissance
    protected int jourCroissance; // nombre de jour de croissance necessaire pour etre consommable

    protected Legume(int calorie,int compteurJourCroissance,int jourCroissance ){
        super(calorie);
        this.compteurJourCroissance = compteurJourCroissance;
        this.jourCroissance = jourCroissance;
    }

    public void replanter(){
        if(this instanceof Patate){
            System.out.println("Une patate a ete replantee \n");
        }
        if(this instanceof Carotte){
            System.out.println("Une carotte a ete replantee \n");
        }
         compteurJourCroissance = 0;
    }
     public abstract void croissance(); 
     public abstract boolean peutProduire();
}



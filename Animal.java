public abstract class Animal implements Agriculteur{
    //Attributs

    protected int compteurJourElevage; // compteur nombre de jour d'elevage
    protected int jourdeProduction; // nombre de jour d'elevage necessaire pour produire
    protected double probReproduction; // probabilité de reproduction

    protected Animal(int compteurJourElevage,int jourdeProduction,double probReproduction){
        this.compteurJourElevage = compteurJourElevage;
        this.jourdeProduction = jourdeProduction;
        this.probReproduction = probReproduction;
    }

    public double getprobReproduction(){
        return probReproduction;
    }

    public abstract Animal clone();
    public abstract void croissance(); 
    public abstract boolean peutProduire();
    public abstract Aliment produire(); // cette methode renvoie ce que l'animal a produit (oeuf ou lait)
}

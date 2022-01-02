public interface Agriculteur{
    // Methodes qui permettent aux animaux et aux aliments d'etre cultivés

    public void croissance(); // incremente les compteurs de jours d'elevage des legumes et des animaux
    public boolean peutProduire(); // renvoie si le legume est consommable ou si l'animal est en etat de produire un aliment 
}



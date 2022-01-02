public class Poule extends Animal {
    //Attributs
    private int quantiteOeuf; // quantite d'oeuf que la poule produit quand elle peut produire
    protected int id;
    protected static int cpt = 0;
    //Constructeur
    public Poule(){
        super(1,2,0.1);
        quantiteOeuf = (int)(Math.random() *3 + 1 );
        cpt++;
        id = cpt;
    }

    //Methodes

    public Poule clone(){
        return new Poule();
    }

    public void croissance(){
        if(compteurJourElevage < jourdeProduction){
            compteurJourElevage++;
        }
    }

    public boolean peutProduire(){
        boolean b = this.compteurJourElevage >= jourdeProduction;
        if(b==false){
            System.out.println(this.toString() +" ne peut pas encore pondre, elle pourra pondre dans "+ (jourdeProduction - compteurJourElevage) +" jours.\n");
        }
        return b;
    }

    public Oeuf produire(){
        return new Oeuf(quantiteOeuf);
    }

    public String toString(){
        return "La poule" + this.id;
    }
}
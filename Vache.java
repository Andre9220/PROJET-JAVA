public class Vache extends Animal {
    //Attributs
    private int litredeLait; // quantite de lait en Litre que la vache produit quand elle peut produire
    protected int id;
    protected static int cpt = 0;
 
    //Constructeur
    public Vache(int litredeLait){
        super(1,5,0.3);
        this.litredeLait = litredeLait;
        cpt++;
        id = cpt;
    }

    //Methodes

    public Vache clone(){
        return new Vache(litredeLait);
    }

    public void croissance(){
        if(compteurJourElevage < jourdeProduction){
            compteurJourElevage++;
        }
    }

    public boolean peutProduire(){
        boolean b = this.compteurJourElevage >= jourdeProduction;
        if(b==false){
            System.out.println(this.toString() +" ne peut pas encore etre traite sera traitable dans " + (jourdeProduction - compteurJourElevage) + " jours. \n");
        }
        return b;
    }

    public Lait produire(){
        return new Lait(litredeLait);
    }

    public String toString(){
        return "La vache" + this.id;
    }
}
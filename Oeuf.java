public class Oeuf extends Aliment{
    //Attributs
    private int nbrOeuf;

    //Constructeur
    public Oeuf(int nbrOeuf){
        super(155);
        this.nbrOeuf = nbrOeuf;
    }

    //Methodes
    public int getCalorie(){
        return  nbrOeuf * calorie ; 
    }
    public Oeuf clone(){
        return new Oeuf(nbrOeuf);
    }
    public String toString(){
        return nbrOeuf + " oeuf";
    }
}


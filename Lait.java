public class Lait extends Aliment{

    //Attribut
    private int litre;

    //Constructeur
    public Lait(int litre){
        super(42);
        this.litre = litre;
    }

    //Methodes
    public int getCalorie(){
        return litre * calorie ; 
    }

    public Lait clone(){
        return new Lait(litre);
    }

    public String toString(){
        return litre + "L de lait" ;
    }
}
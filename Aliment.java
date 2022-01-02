public abstract class Aliment{
    //Attribut
    protected int calorie;

    //Constructeur
    protected Aliment(int calorie){
        this.calorie = calorie;
    }
    
    //Methodes
    public abstract Aliment clone();
    public int getCalorie(){
        return calorie;
    }
}


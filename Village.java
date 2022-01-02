import java.util.ArrayList;
public class Village {
    //Attributs
    private ArrayList<Villageois> population;
    private static final Village INSTANCE = new Village() ;

    //Constructeur
    private Village(){
        population= new ArrayList<Villageois>();
    }

    //Methodes
    public static Village getInstanceVillage() {
        return INSTANCE; 
    }
    public void ajouterVillageois(Villageois v){
        population.add(v);
    }
    
    public int besoinVillage(){
        int res = 0;
        for(Villageois v : population){
            res = res + v.getbesoin_energetique();
        }
        return res;
    } 
    
    public String toString(){
        String s = "Le village est compose de : \n";
        for(Villageois v : population){
            s = s + v.toString() + "\n" ;
        }
        s = s + "le besoin en calories du village est de : " + this.besoinVillage() + "\n";
        return s;
    }
}


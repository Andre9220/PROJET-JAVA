public class Villageois {
    //Attributs
    private String nom;
    private int age;
    private int besoin_energetique ;
    
    //Constructeurs
    public Villageois(int age,String nom){
        this.nom = nom;
        this.age = age;
        // en fonction de l'age on renvoit un besoin en calories different
        if (age<18 && age>10){this.besoin_energetique=2500;}
        if (age>=18){this.besoin_energetique=3000;}
        if (age<=10){this.besoin_energetique=2000;}
    } 

    //Methodes
  	public String toString(){
  		return "Villageois " + this.nom + " " +  this.age +   " ans a besoin de " + this.besoin_energetique+ " calories.";
  	}
      public int getbesoin_energetique(){
          return besoin_energetique;
      }

      public String getNom(){
          return nom;
      }

}
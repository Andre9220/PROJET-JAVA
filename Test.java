public class Test{
    public static void main(String[] args) throws InterruptedException{
        Elevage elevage = new Elevage();
     
        Vache vache = new Vache(2);
        Poule poule = new Poule();

        Villageois v1 = new Villageois(20, "Andre");
        Villageois v2 = new Villageois(8, "Eliott");
        Village village = Village.getInstanceVillage();

        village.ajouterVillageois(v1);
        village.ajouterVillageois(v2);

        System.out.println(village.toString()+"\n\n");

        try{
        elevage.ajouterLegume(new Patate());
        elevage.ajouterLegume(new Carotte());
        elevage.ajouterLegume(new Patate());
        elevage.ajouterLegume(new Carotte());
        }
        catch(TabPleinException e ){
            System.out.println(e.getMessage());
        }

        try{
            elevage.ajouterAnimal(vache);
            elevage.ajouterAnimal(poule);
        }
        catch(TabPleinException e ){
                System.out.println(e.getMessage());
        }

        //TEST POUR UN VILLAGEOIS
        /*while(elevage.totalCalories() <= v1.getbesoin_energetique() ){
            System.out.println(elevage.toString());
            elevage.journee();
            elevage.recolte();
            Thread.sleep(1000);
        }
        System.out.println(elevage.toString());
        System.out.println("Il faut "+ Elevage.getJournee() + " jours de recoltes pour pouvoir nourrir "+ v1.getNom()+"\n");
        */
        while(elevage.totalCalories() <= village.besoinVillage() ){
            System.out.println(elevage.toString());
            elevage.journee();
            elevage.recolte();
             Thread.sleep(2000);
        }
        System.out.println(elevage.toString());
        System.out.println("Il faut "+ Elevage.getJournee() + " jours de recoltes pour pouvoir nourrir le village.");
    }    
}


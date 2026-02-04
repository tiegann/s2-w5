public class Plant{
    public static final boolean usesChlorophyll = true;
    private static int numPlants = 0;
    private final String species;
    private int age;
    private String name;
    private double height;

    public Plant (String name, String species){
          this.name = name;
          this.species = species;
          numPlants++;
       
    }
    public static int getNumPlants(){
        return numPlants;
    }

    public String type(){
         return "I am a plant and my name is: " + this.name;
    }

    public void increaseAge(int years){
         age +=years;
    }

    public String name(){
        return name;
    }
    public int age(){
        return age;
    }
    public void setSpecies (String sp){
    }
}

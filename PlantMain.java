public class PlantMain {
    public static void main(String[] args) {
       boolean v = Plant.usesChlorophyll;
       Plant p = new Plant("rose", "c");
       Plant p1 = new Plant("ivy", "b");
       System.out.println(Plant.getNumPlants());
       System.out.println(p.getNumPlants());
       Plant p2 = new Plant("ivy", "b");
       Plant p3 = new Plant("ivy", "b");
       Plant p4 = new Plant("ivy", "b");
       System.out.println(Plant.getNumPlants());
       System.out.println(p4.getNumPlants());
    }    
}

package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Thread oneToHundred = new NumberOneToHundredThread();
        Thread hundredToOne = new NumberHundredToOneThread();

        oneToHundred.start();
        hundredToOne.start();
    }
   
}

package ejercicio1;

public class NumberHundredToOneThread extends Thread{
    
    public NumberHundredToOneThread() {
    }

    @Override
    public void run() {
        for(int i = 100; i >= 1; i--) {
            System.out.println("Hilo 2: " + i);;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

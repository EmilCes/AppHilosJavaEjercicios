package ejercicio1;

public class NumberOneToHundredThread extends Thread{
    
    public NumberOneToHundredThread() {
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println("Hilo 1: " + i);;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

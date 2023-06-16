package day7;

public class Threads implements Runnable {
    private boolean running;
    private int value;

    public Threads(int value) {
        this.value = value;
        this.running = true;
    }
    public void stopThread(){
        this.running = false;

    }
    @Override
    public void run() {
        System.out.println("Hello " + value + "!");
        int count = 0;
        while (running) {

            try {
                System.out.println("Modified value: " + value);
                Thread.sleep(5000);
                count+=5;
                if(count==20){
                    stopThread();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void modifyValue(int newValue) {
        value = newValue;
    }

    public void stop() {
        running = false;
    }
}

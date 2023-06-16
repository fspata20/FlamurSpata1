package day7;


public class Main {
    public static void main(String[] args) {
        Threads obj1 = new Threads(1);
        Threads obj2 = new Threads(2);

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
        obj1.modifyValue(13);

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

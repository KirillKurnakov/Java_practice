class Ping extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);// остановка потока на 1 секунду
            } catch (InterruptedException e) {}

            System.out.println("Ping");
        }
    }
}

public class Pong {

    public static void main(String[] args) {
        Ping thread = new Ping();
        thread.start(); // запуск потока

        while (true) {
            try {
                Thread.sleep(1000);// остановка потока на 1 секунду
            } catch (InterruptedException e) {}

            System.out.println("Pong");
        }
    }
}
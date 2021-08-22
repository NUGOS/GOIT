package ua.goit.modul.modul11;

public class TimerThread {

    static final Object MONITOR = new Object();
    static int secondsFromStart = 0;

    public static void main(String[] args) {
        System.out.println("\n");
        new TimerThread().secondsHandler(16);// Задаем время таймера в секундах
    }

    public void secondsHandler(int timeInSec) {
        Thread thr1 = new Thread(() -> {
            while (secondsFromStart <= timeInSec) {
                makePause(1000);
                synchronized (MONITOR) {
                    if (secondsFromStart == 0) {
                        System.out.println("Запуск программы!!!");
                    } else {
                        System.out.printf("Прошло %d секунд от старта прогррамы\n", secondsFromStart);
                        if (secondsFromStart % 5 == 0) {
                            MONITOR.notifyAll();
                            monitorWait(1000);
                        }
                    }
                    secondsFromStart++;
                }
            }
        });

        Thread thr2 = new Thread(() -> {
            while (thr1.isAlive()) {
                synchronized (MONITOR) {
                    if (secondsFromStart == 0) {
                        MONITOR.notifyAll();
                        monitorWait(10000);
                    } else if (secondsFromStart % 5 == 0 && secondsFromStart != timeInSec) {
                        System.out.println("Прошло 5 секунд");
                        MONITOR.notifyAll();
                        monitorWait(6000);
                    } else if (secondsFromStart % 5 == 0 && secondsFromStart == timeInSec) {
                        System.out.println("Прошло 5 секунд");
                        MONITOR.notifyAll();
                        try {
                            MONITOR.wait(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            System.out.println("The session is finished");
        });

        thr1.start();
        thr2.start();
    }

    public static void makePause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void monitorWait(int time) {
        try {
            MONITOR.wait(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



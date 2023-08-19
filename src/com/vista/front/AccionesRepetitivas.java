package com.vista.front;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AccionesRepetitivas {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable tarea1 = () -> {
            System.out.println("Accion 1");
        };

        Runnable tarea2 = () -> {
            System.out.println("Accion 2");
        };

        Runnable tarea3 = () -> {
            System.out.println("Accion 3");
        };

        executor.scheduleAtFixedRate(tarea1, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(tarea2, 1, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(tarea3, 2, 3, TimeUnit.SECONDS);
    }
}

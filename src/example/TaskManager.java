package example;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int EXIT = 0;
        final int ADD = 1;
        final int POOL = 2;
        Queue<Task> tasks = new PriorityQueue<>();
        int options = -1;
        while (options != EXIT) {
            System.out.println("Wybierz opcję: ");
            System.out.println(EXIT + " - wyjście z programu");
            System.out.println(ADD + " - dodanie nowego zadania");
            System.out.println(POOL + " - wyświetlenie kolejnego zadania");
            options = sc.nextInt();
            sc.nextLine();
            switch (options) {
                case ADD -> tasks.offer(makeTask());
                case POOL -> System.out.println(tasks.poll());
                case EXIT -> System.out.println("Koniec programu");
            }
        }
    }

    private static Task makeTask(){
        System.out.println("Podaj nazwę zadania");
        String name = sc.nextLine();
        System.out.println("Podaj opis");
        String description = sc.nextLine();
        System.out.println("Podaj priorytet");
        System.out.println(Priority.LOW.ordinal() + " - niski");
        System.out.println(Priority.MODERATE.ordinal() + " - średni");
        System.out.println(Priority.HIGH.ordinal() + " - wysoki");
        int number = sc.nextInt();
        sc.nextLine();
        Priority priority = Priority.fromInt(number);
        return new Task(name,description,priority);
    }
}

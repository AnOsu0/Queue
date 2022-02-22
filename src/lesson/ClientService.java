package lesson;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ClientService {
    public static void main(String[] args) {
//        Queue<Client> clients = new LinkedList<>();
        Queue<Client> clients = new PriorityQueue<>(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                return Integer.compare(c1.getOrdersNumber(),c2.getOrdersNumber());
            }
        });
//        Queue<Client> clients = new ArrayBlockingQueue<>(3);
        clients.offer(new Client("Karol",2)); // tak samo jak metoda add działa metoda offer
        clients.offer(new Client("Patrycja",1));
        clients.offer(new Client("Andrzej",4));
        clients.offer(new Client("Karolina",3));

//        Client client1 = clients.peek();
//        Client client2 = clients.peek();
//        Client client3 = clients.peek();
//
//        Client client1 = clients.poll();
//        Client client2 = clients.poll();
//        Client client3 = clients.poll();
        System.out.println(clients);
        while (!clients.isEmpty()) {
            System.out.println("Obsługiwany klient " + clients.poll());
        }
    }
}

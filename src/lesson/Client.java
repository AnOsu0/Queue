package lesson;

public class Client implements Comparable<Client>{
    private String nickname;
    private int ordersNumber;

    public Client(String nickname, int ordersNumber) {
        this.nickname = nickname;
        this.ordersNumber = ordersNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    @Override
    public String toString() {
        return nickname + " " + ordersNumber;
    }

    @Override
    public int compareTo(Client o) {
        return -Integer.compare(ordersNumber,o.ordersNumber);
    }
}

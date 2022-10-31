package generics.transport;

public class BoxsForCar <E> {

    private E transport;

    public void setTransport(E transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transport=" + transport.toString() +
                '}';
    }
}

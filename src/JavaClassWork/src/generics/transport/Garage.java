package generics.transport;

import java.util.ArrayList;
import java.util.List;

public class Garage<E> {

    List <E> transport;

    public  Garage () {this.transport = new ArrayList<>();}
    public void addTransport (E transport) { transport.add(transport);}
    public List<E> getTransport () {return transport;}
}

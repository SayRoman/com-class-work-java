package generics.transport;

import java.util.ArrayList;
import java.util.List;

public class AvtoPark <E>{

    List<E> avtotransport;

    public AvtoPark () {
        this.avtotransport = new ArrayList<>();
    }

    public void addTransport(E transport) {
        avtotransport.add(transport);
    }

    public List<E> getAvtotransport () {
        return avtotransport ;
    }
}

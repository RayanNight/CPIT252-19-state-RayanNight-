package subjects;
 
import java.util.ArrayList;
import java.util.List;

import observers.Observer;
 
public class MessageSubject implements Subject {
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(String m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}
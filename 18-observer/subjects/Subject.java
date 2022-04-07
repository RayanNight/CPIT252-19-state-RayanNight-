package subjects;

import observers.Observer;


public interface Subject{
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyUpdate(String m);
}

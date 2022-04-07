package observers;

public class TwitterObserver implements Observer{
    @Override
    public void update(String message){
        System.out.println("Twitter Observer :: " + message);
    }
}

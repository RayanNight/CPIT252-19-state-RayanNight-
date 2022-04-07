package observers;

public class FacebookObserver implements Observer{
    @Override
    public void update(String message){
        System.out.println("Facebook Observer :: " + message);
    }
}

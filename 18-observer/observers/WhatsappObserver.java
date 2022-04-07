package observers;;

public class WhatsappObserver implements Observer{
    @Override
    public void update(String message){
        System.out.println("Whatsapp Observer :: " + message);
    }
}

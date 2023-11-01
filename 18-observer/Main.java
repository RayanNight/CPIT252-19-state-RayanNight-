import subjects.*;
import observers.*;

public class Main {
    public static void main(String[] args){
            Observer fbObserver = new FacebookObserver();
            Observer emailObserver = new EmailObserver();
            Observer waObserver = new WhatsappObserver();

            Subject s = new MessageSubject();

            s.subscribe(fbObserver);
            s.subscribe(emailObserver);

            s.notifyUpdate("Heavy rain alert. Expected to start in Jeddah in a few hours.");

            System.out.println("\nChange observers: unsubscribed email and subscribed Whatsapp\n");
            s.unsubscribe(emailObserver);
            s.subscribe(waObserver);

            s.notifyUpdate("Heavy rain alert. Expected to start in Jeddah soon,");
        }
}

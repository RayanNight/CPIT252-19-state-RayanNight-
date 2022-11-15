package memento;


public class Client {
  public static void main(String[] args) {

    int saveFiles = 0, currentArticle = 0;
    String theArticle;

    CareTaker caretaker = new CareTaker();
    Originator originator = new Originator();

    originator.set("Article 1: I walked. ");
    caretaker.addMemento( originator.storeInMemento() );
    saveFiles++;
    currentArticle++;
    System.out.println("Save Files " + saveFiles);
    System.out.println("Current Article " + currentArticle);

    originator.set("Article 2: I walked in the street. ");
    caretaker.addMemento( originator.storeInMemento() );
    saveFiles++;
    currentArticle++;
    System.out.println("Save Files " + saveFiles);
    System.out.println("Current Article " + currentArticle);

    if (currentArticle >= 1){
      currentArticle--;
      theArticle= originator.restoreFromMemento(caretaker.getMemento(currentArticle));
      System.out.println("Save Files " + saveFiles);
      System.out.println("Current Article " + currentArticle);
    }
    else
      System.out.println("\n There are no more saved articles.");
    if (currentArticle >= 1){
      currentArticle--;
      theArticle= originator.restoreFromMemento(caretaker.getMemento(currentArticle));
      System.out.println("Save Files " + saveFiles);
      System.out.println("Current Article " + currentArticle);
    }
    else
      System.out.println("\n There are no more saved articles.");

    if ((saveFiles - 1) > currentArticle){

      currentArticle++;
      theArticle = originator.restoreFromMemento( caretaker.getMemento(currentArticle) );
      System.out.println("Save Files " + saveFiles);
      System.out.println("Current Article " + currentArticle);
    }
  }
}


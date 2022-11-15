package iterator;

public class NameIterator implements Iterator {

  String names[];
  int index;

  public NameIterator(String[] newName){
    this.names = newName;
  }

  @Override
  public boolean hasNext() {
    if(index <names.length){
      return true;
    }
    return false;
  }

  @Override
  public Object next() {
    if(this.hasNext()){
      return names[index++]; 
    }
    return null;
  }
}





package iterator;

import java.util.List;
import java.util.ArrayList;

public class NameIterator implements Iterator {

  String[] names;
  //List<String> names;
  int index;

  public NameIterator(String[] newNames) {
    this.names = newNames;
    // this.names = new ArrayList<String>();
    // for (String name : newNames) {
    //   this.names.add(name);
    // }
  }

  @Override
  public boolean hasNext() {
    if(index <names.length){
    // if (index < names.size()) {
      return true;
    }
    return false;
  }

  @Override
  public Object next() {
    if (this.hasNext()) {
      return names[index++];
      // return names.get(index++);
    }
    return null;
  }
}

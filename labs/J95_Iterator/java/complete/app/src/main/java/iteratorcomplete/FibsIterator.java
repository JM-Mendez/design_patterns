package iteratorcomplete;

class FibsIterator implements IIterator<Integer>{
  private int current = 1;
  private int next = 2;

  public void next(){
    int newNext = this.current + this.next;
    this.current = this.next;
    this.next = newNext;
  }

  public boolean hasNext(){
    return true;
  }

  public Integer getItem(){
    return this.current;
  }

}
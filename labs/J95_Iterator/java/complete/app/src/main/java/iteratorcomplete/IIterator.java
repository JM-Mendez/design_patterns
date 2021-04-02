package iteratorcomplete;

interface IIterator<T> {
  void next();
  boolean hasNext();
  T getItem();
}
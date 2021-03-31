package StrategyComplete;

public class SevenZCompressionStrategy implements ICompressionStrategy {

  @Override
  public Stream compress(Stream uncompressed) {
    System.out.println("Compressing via 7z");
    return uncompressed;
  }
  
}

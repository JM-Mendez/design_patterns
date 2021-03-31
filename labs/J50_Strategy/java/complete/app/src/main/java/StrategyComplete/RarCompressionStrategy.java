package StrategyComplete;

public class RarCompressionStrategy implements ICompressionStrategy {

  @Override
  public Stream compress(Stream uncompressed) {
    System.out.println("Compressing via Rar");
    return uncompressed;
  }
  
}

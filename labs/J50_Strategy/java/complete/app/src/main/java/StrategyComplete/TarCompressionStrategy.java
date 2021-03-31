package StrategyComplete;

public class TarCompressionStrategy implements ICompressionStrategy {

  @Override
  public Stream compress(Stream uncompressed) {
    System.out.println("Compressing via Tar");
    return uncompressed;
  }
  
}

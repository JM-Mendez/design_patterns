package StrategyComplete;

public class ZipCompressionStrategy implements ICompressionStrategy {

  @Override
  public Stream compress(Stream uncompressed) {
    System.out.println("Compressing via Zip");
    return uncompressed;
  }
  
}

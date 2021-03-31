package StrategyComplete;

public interface ICompressionStrategy {
  Stream compress(Stream uncompressed);
}

from stream import Stream
from compression_strategy import CompressionStrategy

class RarCompressionStrategy(CompressionStrategy):
    def compress(self,uncompressed:Stream)->Stream:
        print('Compressing via rar')
        return Stream()
from stream import Stream
from compression_strategy import CompressionStrategy

class SevenZCompressionStrategy(CompressionStrategy):
    def compress(self,uncompressed:Stream)->Stream:
        print('Compressing via 7z')
        return Stream()
from stream import Stream
from compression_strategy import CompressionStrategy

class TarCompressionStrategy(CompressionStrategy):
    def compress(self,uncompressed:Stream)->Stream:
        print('Compressing via targz')
        return Stream()
from stream import Stream
from compression_strategy import CompressionStrategy

class ZipCompressionStrategy(CompressionStrategy):
    def compress(self,uncompressed:Stream)->Stream:
        print('Compressing via zip')
        return Stream()
from stream import Stream

class CompressionStrategy():
    def compress(self,uncompressed:Stream)->Stream:
        raise Exception('Not implemented')
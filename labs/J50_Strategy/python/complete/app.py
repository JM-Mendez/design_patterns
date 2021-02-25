from stream import Stream
from rar_compression_strategy import RarCompressionStrategy
from tar_compression_strategy import TarCompressionStrategy
from sevenz_compression_strategy import SevenZCompressionStrategy

from enum import Enum

class Format(Enum):
   sevenzip = 1
   tar = 2
   zip = 3
   rar = 4

compressors = {
    Format.rar : RarCompressionStrategy(),
    Format.sevenzip : SevenZCompressionStrategy(),
    Format.tar : TarCompressionStrategy(),
    Format.zip: SevenZCompressionStrategy(),
}


def getUserChoice()->Format:
    return Format.rar

def compress(format:Format, uncompressed:Stream)-> Stream:
    return compressors[format].compress(uncompressed)

big_list_of_data = Stream()

print('Exporting big file!')
compressed = compress(getUserChoice(), big_list_of_data)

print('Done.')



from stream import Stream
from exporter import Exporter
from enum import Enum

class Format(Enum):
   sevenzip = 1
   tar = 2
   zip = 3
   rar = 4


def getUserChoice()->Format:
    return Format.rar

def compress(format:Format, uncompressed:Stream)-> Stream:
    if format == Format.sevenzip:
        return Exporter.to_7z(uncompressed);
    if format == Format.tar:
        return Exporter.to_targz(uncompressed)
    if format == Format.rar:
        return Exporter.to_rar(uncompressed)
    if format == Format.zip:
        return Exporter.to_zip(uncompressed)
    raise Exception('Bogus choice!')


big_list_of_data = Stream()

print('Exporting big file!')
compressed = compress(getUserChoice(), big_list_of_data)

print('Done.')



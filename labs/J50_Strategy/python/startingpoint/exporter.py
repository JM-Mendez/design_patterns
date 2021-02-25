from stream import Stream


class Exporter():
    def to_zip(uncompressed:Stream)->Stream:
        print('Compressing via Zip')
        return Stream()

    def to_7z(uncompressed:Stream)->Stream:
        print('Compressing via 7z')
        return Stream()

    def to_rar(uncompressed:Stream)->Stream:
        print('Compressing via rar')
        return Stream()

    def to_targz(uncompressed:Stream)->Stream:
        print('Compressing via targz')
        return Stream()

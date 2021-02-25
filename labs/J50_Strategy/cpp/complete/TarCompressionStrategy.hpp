#include "Stream.hpp"
#include <iostream>
#include "CompressionStrategy.hpp"

using namespace std;

class TarCompressionStrategy : public CompressionStrategy
{
public:
	Stream compress(Stream uncompressed)
	{
		cout << "Compressing via tar" << endl;
		return Stream();
	}

};

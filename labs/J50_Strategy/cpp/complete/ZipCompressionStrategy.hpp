#include "Stream.hpp"
#include <iostream>
#include "CompressionStrategy.hpp"

using namespace std;

class ZipCompressionStrategy : public CompressionStrategy
{
public:
	Stream compress(Stream uncompressed)
	{
		cout << "Compressing via zip" << endl;
		return Stream();
	}

};

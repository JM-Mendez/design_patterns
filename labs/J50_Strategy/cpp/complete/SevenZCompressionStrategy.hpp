#include "Stream.hpp"
#include <iostream>
#include "CompressionStrategy.hpp"

using namespace std;

class SevenZCompressionStrategy : public CompressionStrategy
{
public:
	Stream compress(Stream uncompressed)
	{
		cout << "Compressing via 7z" << endl;
		return Stream();
	}

};

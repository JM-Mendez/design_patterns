#include "Stream.hpp"
#include <iostream>
#include "CompressionStrategy.hpp"

using namespace std;

class RarCompressionStrategy : public CompressionStrategy
{
public:
	Stream compress(Stream uncompressed)
	{
		cout << "Compressing via rar" << endl;
		return Stream();
	}

};

#include <iostream>
#include <string>
#include "Stream.hpp"
#include "CompressionStrategy.hpp"
#include "ZipCompressionStrategy.hpp"
#include "RarCompressionStrategy.hpp"
#include "TarCompressionStrategy.hpp"
#include "SevenZCompressionStrategy.hpp"




using namespace std;

Stream compress(string format, Stream uncompressed)
{
	throw "Bad format!";
}


int main() {
	cout << "Compressing big file:" << endl;

	auto c1 = new ZipCompressionStrategy();
	auto c2 = new RarCompressionStrategy();
	auto c3 = new TarCompressionStrategy();
	auto c4 = new SevenZCompressionStrategy();


//	auto format = "zip";
//	auto uncompressed = Stream();
//	auto compressed = compress(format, uncompressed);

	cout << "Done." << endl;
	return 0;
}

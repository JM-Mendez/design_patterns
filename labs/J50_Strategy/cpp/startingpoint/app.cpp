#include <iostream>
#include <string>
#include "Stream.hpp"
#include "Compressor.hpp"

using namespace std;

Stream compress(string format, Stream uncompressed)
{
	if(format == "zip")
	{
		return Compressor::to_zip(uncompressed);
	}
	if(format == "rar")
	{
		return Compressor::to_rar(uncompressed);
	}
	if(format == "tar")
	{
		return Compressor::to_tar(uncompressed);
	}
	if(format == "7z")
	{
		return Compressor::to_seven7(uncompressed);
	}
	throw "Bad format!";
}


int main() {
	cout << "Compressing big file:" << endl;

	auto format = "zip";
	auto uncompressed = Stream();
	auto compressed = compress(format, uncompressed);

	cout << "Done." << endl;
	return 0;
}

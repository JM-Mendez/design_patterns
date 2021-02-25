#include <iostream>
#include "Stream.hpp"

using namespace std;

class Compressor
{
public:

	static Stream to_seven7(Stream uncompressed)
	{
		cout << "Compressing via 7zip" << endl;
		return Stream();
	}

	static Stream to_rar(Stream uncompressed)
	{
		cout << "Compressing via rar" << endl;
		return Stream();
	}

	static Stream to_zip(Stream uncompressed)
	{
		cout << "Compressing via zip" << endl;
		return Stream();
	}

	static Stream to_tar(Stream uncompressed)
	{
		cout << "Compressing via tar" << endl;
		return Stream();
	}



};

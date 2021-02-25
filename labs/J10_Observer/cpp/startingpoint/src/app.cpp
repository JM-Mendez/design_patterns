
#include <iostream>
#include "FileDownloader.hpp"
using namespace std;



int main() {
	auto downloader = FileDownloader();
	downloader.download("https://example.com/somefile.txt");

	return 0;
}

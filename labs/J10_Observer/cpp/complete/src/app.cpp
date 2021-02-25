
#include <iostream>
#include "FileDownloader.hpp"
#include "Logger.hpp"
#include "ProgressReporter.hpp"
using namespace std;

#include <stdio.h>



int main() {
	auto logger = Logger();
	auto progressReporter = ProgressReporter();
	auto downloader = FileDownloader();

	downloader.progressUpdate.subscribe([&logger](auto message){logger.info(message);});
	downloader.progressUpdate.subscribe([&progressReporter](auto message){progressReporter.update(message);});

	downloader.download("https://example.com/somefile.txt");

	return 0;
}

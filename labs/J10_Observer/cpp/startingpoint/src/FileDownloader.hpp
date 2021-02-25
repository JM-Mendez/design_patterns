#import "Logger.hpp"
#import "ProgressReporter.hpp"

class FileDownloader
{

	Logger logger = Logger();
	ProgressReporter reporter = ProgressReporter();


public:

	void download(string file)
	{
		const auto beginMessage = "Beginning to download";
		logger.info(beginMessage);
		reporter.update(beginMessage);

		for(int i =0; i<10;i++)
		{
			const auto message = "Percent complete:" + to_string(i*10);
			logger.info(message);
			reporter.update(message);

		}
		const auto doneMessage = "Done downloading.";
		logger.info(doneMessage);
		reporter.update(doneMessage);
	}


};

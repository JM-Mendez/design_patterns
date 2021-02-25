#import "Event.hpp"


class FileDownloader
{

public:
	Event progressUpdate = Event();

	void download(string file)
	{
		const auto beginMessage = "Beginning to download";
		progressUpdate.notify(beginMessage);

		for(int i =0; i<10;i++)
		{
			const auto message = "Percent complete:" + to_string(i*10);
			progressUpdate.notify(message);

		}
		const auto doneMessage = "Done downloading.";
		progressUpdate.notify(doneMessage);
	}


};

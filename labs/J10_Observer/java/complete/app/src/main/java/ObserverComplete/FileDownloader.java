package ObserverComplete;

public class FileDownloader {
    private final ProgressReporter reporter = new ProgressReporter();
    private final Logger logger = new Logger(); 


    public void download(String file){
        final String beginMessage = "Beginning to download.";
        this.logger.info(beginMessage);
        this.reporter.update(beginMessage);

        for(int i =0; i<10;i++)
		{
			final String message = "Percent complete: " + String.valueOf(i*10);
			logger.info(message);
			reporter.update(message);
		}

        final String doneMessage = "Done downloading.";
        this.logger.info(doneMessage);
        this.reporter.update(doneMessage);        

    }



}

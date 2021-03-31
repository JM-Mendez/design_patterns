package ObserverComplete;

public class FileDownloader {
    public final Event progressUpdate = new Event();

    public void download(String file){
  
        this.progressUpdate.notifyObservers("Beginning to download.");

        for(int i =0; i<10;i++)
		{
			this.progressUpdate.notifyObservers("Percent complete: " + String.valueOf(i*10));
		}

        this.progressUpdate.notifyObservers("Done downloading.");
    }

}

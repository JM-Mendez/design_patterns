package ObserverComplete;

public class App {

    public static void main(String[] args) {
        
        final FileDownloader downloader = new FileDownloader();
        final ProgressReporter reporter = new ProgressReporter();
        final Logger logger = new Logger();

        downloader.progressUpdate.register(logger::info);
        downloader.progressUpdate.register(reporter::update);

        downloader.download("https://example.com/bigfile.txt");

        System.out.println("\nDone!");
    }
}

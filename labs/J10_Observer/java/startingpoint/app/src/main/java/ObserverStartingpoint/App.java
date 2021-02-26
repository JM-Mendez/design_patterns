package ObserverStartingpoint;

public class App {

    public static void main(String[] args) {
        
        final FileDownloader downloader = new FileDownloader();
        downloader.download("https://example.com/bigfile.txt");

        System.out.println("\nDone!");
    }
}

package StrategyStartingpoint;

public class App {
    public static Stream compress(String format, Stream raw) throws Exception {
        if(format == "zip")
        {
            return Compressor.to_zip(raw);
        }
        if(format == "rar")
        {
            return Compressor.to_rar(raw);
        }
        if(format == "tar")
        {
            return Compressor.to_tar(raw);
        }
        if(format == "7z")
        {
            return Compressor.to_seven7(raw);
        }
        throw new Exception("Bad format!");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Compressing big file...");

        String format = "zip";
        Stream uncompressed = new Stream();
        Stream compressed = compress(format, uncompressed);
    
        System.out.println("Done.");
    }
}

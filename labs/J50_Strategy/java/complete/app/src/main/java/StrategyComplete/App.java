package StrategyComplete;

import java.util.HashMap;
import java.util.Map;

public class App {

    private static final Map<String,ICompressionStrategy> strategies = new HashMap<String,ICompressionStrategy>()
    {{
        put("zip", new ZipCompressionStrategy());
        put("tar", new TarCompressionStrategy());
        put("rar", new RarCompressionStrategy());
        put("7z", new SevenZCompressionStrategy());
    }};

    public static Stream compress(String format, Stream raw) throws Exception {
        ICompressionStrategy strategy = strategies.get(format);
        return strategy.compress(raw);
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Compressing big file...");

        String format = "zip";
        Stream uncompressed = new Stream();
        Stream compressed = compress(format, uncompressed);
    
        System.out.println("Done.");
    }
}

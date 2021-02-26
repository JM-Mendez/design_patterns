package VisitorStartingpoint;

public class App {


    public static DirectoryInfo getFileSystemRoot() {
        DirectoryInfo net = new DirectoryInfo("net");
        net.addChild(new FileInfo("tun"));
    
        DirectoryInfo dev = new DirectoryInfo("dev");
        dev.addChild(new FileInfo("full"));
        dev.addChild(new FileInfo("fuse"));
        dev.addChild(net);
    
        DirectoryInfo opt = new DirectoryInfo("opt");
        opt.addChild(new FileInfo("explosives.txt"));
        opt.addChild(new FileInfo("secrets.txt"));
    
        DirectoryInfo root = new DirectoryInfo("$");
        root.addChild(new FileInfo("settings.ini"));
        root.addChild(new FileInfo("thing.ini"));
        root.addChild(dev);
        root.addChild(opt);
    
        return root;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

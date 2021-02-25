from filesysteminfo import FileSystemInfo, DirectoryInfo, FileInfo


def getFileSystemRoot():
    net = DirectoryInfo("net")
    net.addChild(FileInfo("tun"))

    dev = DirectoryInfo("dev")
    dev.addChild(FileInfo("full"))
    dev.addChild(FileInfo("fuse"))
    dev.addChild(net)

    opt = DirectoryInfo("opt")
    opt.addChild(FileInfo("explosives.txt"))
    opt.addChild(FileInfo("secrets.txt"))

    dollar = DirectoryInfo("$")
    dollar.addChild(FileInfo("settings.ini"))
    dollar.addChild(FileInfo("thing.ini"))
    dollar.addChild(dev)
    dollar.addChild(opt)

    return dollar


if __name__ == "__main__":
    root = getFileSystemRoot()
    root.print()

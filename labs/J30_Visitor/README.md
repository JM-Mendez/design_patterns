# Lab: File Observer

## Summary

This application models a hierarchical file system. Files
contain data; Directories-- aka 'folders'-- hold files
and other directories.

You need to print out a director structure, but you 
don't want the file system classes themselves to know
too much about how to be printed.



## Requirements
1. Create an abstraction for a file system visitor
2. Implement the abstraction to print hierachical information like this:

```
$\
  settings.ini
  thing.ini
  dev\
    full.txt
    fuse.txt
    net\
      tun
  opt\
    explosives.txt
    secrets.txt
```



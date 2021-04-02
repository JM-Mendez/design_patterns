# Lab: Download Observer

## Summary

This is a command-line application for downloading large files. While 
the file is downloading, progress is reported to the user _and_ to
a log file.

Everything works ok, but the design isn't great. The downloader
is tightly coupled to the consuming code.



## Requirements
1. Make the progress updates observable
2. Wire up subjects in `main()`



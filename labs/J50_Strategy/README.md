# Sales Leads

## Background
Your company generates sales leads-- essentially a person who's interested 
in a particular product category-- and sells them on to clients. Clients 'own' 
leads for a set amount of time before they expire. 

The application's user interface allows clients to export their leads into a 
variety of formats. Because the list of leads can be quite long, downloads are 
often compressed into one of the following formats: zip, rar, 7z, tar/gz.


## Problem
Managing all the different compression algorithms is getting ugly. Right now 
the Exporter class just has one method for each style of compression. Adding 
support for a new compression method means adding a new method then modifying 
several case statements.

How do you refactor the application to reduce the ugliness?


## Requirements
* Create an abstraction for compression strategy
* Implement the abstraction for each compression algorithm
* Use a data structure to associate a string label with each implementation
  - i.e. The string 'zip' to the instance of `ZipCompressor` 


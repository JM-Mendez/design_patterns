# Fulfillment

## Background
This application manages a warehouse. Here's the normal sequence for an order:
   placed -> in process -> picked -> shipped -> delivered

But there are some other paths:
   * When the warehouse is out of product, an order is backordered.
   * When stuff comes in, the backorder goes to "in process".
   * Only backorders can be cancelled.

Currently, the order has a Status field, populated by one of the following string constants:
   * placed
   * in process
   * picked
   * shipped
   * delivered


## Problem
* Occasionally, orders end up in a bogus state. It's unclear how, but something takes them from 
    shipped to placed, and customers are getting duplicate product.

* The next release includes support for lost orders. (Currently customer service just places a 
    new order when customers complain.

How do you model the order status so that it's hard to screw up and easy to change the flow?





## Currency Trading

#### Background
This application acts as a matchmaker between people who want to trade currency. When an order is placed, the application debits and credits both accounts within a transaction. 

The application also supports sell triggers. When a threshold is crossed, open positions are automatically closed.

#### Problem
The next release includes support for complex positions. For example, I might want to buy the Yen and short sell the Euro as part of the same position-- in hopes the two currencies converge. When the trigger fires, all positions need to be closed.

How do you model complex positions?






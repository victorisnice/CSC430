StockLedger myStocks = new StockLedger();myStocks.buy(20, 45);                   // Buy  20 shares at $45myStocks.buy(20, 75);                   // Buy  20 shares at $75double capGain = myStocks.sell(30, 65); // Sell 30 shares at $65// Version 4.0
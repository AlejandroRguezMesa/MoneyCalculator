package moneycalculator;

import command.CommandCalculator;
import graphic.GUI;
import persistence.CurrencyLoader;
import persistence.ExRateLoader;

public class MoneyApp {
    static MoneyApp moneyApp;
    CurrencyLoader currencyLoader;
    ExRateLoader exRateLoader;
    GUI gui;
    
    public static MoneyApp start() {
        
        if (moneyApp == null) {
            moneyApp = new MoneyApp();
            moneyApp.currencyLoader = CurrencyLoader.initialize();
            moneyApp.exRateLoader = ExRateLoader.initialize();
            moneyApp.gui = GUI.start(moneyApp.currencyLoader.getCurrencyList());
            moneyApp.gui.addCommand(new CommandCalculator(moneyApp.gui, moneyApp.exRateLoader));
            moneyApp.gui.showGUI();
        }
        
        return moneyApp;
    }
}
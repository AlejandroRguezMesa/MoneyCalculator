/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package graphic;


import command.Command;
import java.util.List;
import model.Currency;
import model.Money;

public interface GUI {

    /*Factory Method*/
    public static GUI start(List<Currency> currencies) {
        return MoneyGUI.start(currencies);
    };
    
    public GUI showGUI();
    public List<Currency> getCurrencies();
    public void addCommand(Command command);
    public void showMoney(Money money);
    public Double getAmount();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistence;


import model.Currency;
import model.ExchangeRate;

public interface ExRateLoader {
    public static ExRateLoader initialize() {
        return new ExRateLoaderFromWeb();
    }
    public ExchangeRate getExRateFromTo(Currency from, Currency to);
}
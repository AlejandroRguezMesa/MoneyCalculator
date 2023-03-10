/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Currency {
    private final String code;
    private final String name;
    private final String symbol;

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String code() {
        return code;
    }

    public String name() {
        return name;
    }

    public String symbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return  name + " (" + symbol + ')';
    }
}
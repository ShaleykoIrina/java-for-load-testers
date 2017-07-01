package com.oop.server;

public interface CalculatorHistory {
    public void addToLog(String command);
    public String[] getLog();
}

package com.oop.server;

public class CalculatorHistoryStub implements CalculatorHistory {
    @Override
    public void addToLog(String command) {
        System.out.println("[DEBUG] Command logged: '" + command + "'");
    }

    @Override
    public String[] getLog() {
        return new String[] { "[DEBUG] test entry 1", "[DEBUG] test entry 2" };
    }
}

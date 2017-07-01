package com.oop.server;

import javax.xml.ws.Endpoint;

public class CalculatorRunner {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/CalculatorWebService",
            new Calculator(new CalculatorHistoryStub())
        );
    }
}

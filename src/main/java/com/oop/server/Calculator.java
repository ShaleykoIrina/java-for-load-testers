package com.oop.server;

import javax.jws.WebService;

/**
 * To generate stubs use console commands:
 * <code>
 *     > mvn clean package
 *     > wsgen -verbose -cp target/classes/ -d target/classes/ -keep -s target/generated-sources com.oop.server.Calculator
 *     > java -cp target/JavaForLoadTesters-1.0-SNAPSHOT.jar com.oop.server.CalculatorRunner
 *     > wsimport -d target/classes/ -keep -p com.oop.client -s target/generated-sources http://localhost:8080/CalculatorWebService?wsdl
 *     > [Add target/generated-sources to Sources Root with IDEA]
 *     > Uncomment CalculatorClient
 * </code>
 */
@WebService
public class Calculator {
    private CalculatorHistory log;

    public Calculator() {} //Need for wsgen

    public Calculator(CalculatorHistory log) {
        this.log = log;
    }

    public int add(int a, int b) {
        log.addToLog(a + " add " + b);
        return a + b;
    }

    public String[] getLog() {
        return log.getLog();
    }
}

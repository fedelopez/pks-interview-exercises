package com.pks.company;

import java.io.File;
import java.io.IOException;

public class Main {

    //print out the employee with the highest salary
    public static void main(String[] args) throws IOException {
        File csv = new File(Main.class.getResource("employees.csv").getFile());
        Organisation organisation = Organisation.instanceFromCSV(csv);

        Employee employee = organisation.getHighestPaidEmployees(1).get(0);
        System.out.println("The highest paid employee is = " + employee);
    }
}

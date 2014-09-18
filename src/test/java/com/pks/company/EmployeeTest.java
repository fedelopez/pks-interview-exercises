package com.pks.company;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void constructorTest() throws Exception {
        Employee employee = new Employee("joe", "bloggs");
        Assert.assertEquals("joe", employee.getName());
        Assert.assertEquals("bloggs", employee.getSurname());
    }
}

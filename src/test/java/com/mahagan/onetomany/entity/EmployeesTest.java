package com.mahagan.onetomany.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeesTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Employees}
     *   <li>{@link Employees#setEmployee_Age(String)}
     *   <li>{@link Employees#setEmployee_Location(String)}
     *   <li>{@link Employees#setEmployee_Name(String)}
     *   <li>{@link Employees#setId(int)}
     *   <li>{@link Employees#getEmployee_Age()}
     *   <li>{@link Employees#getEmployee_Location()}
     *   <li>{@link Employees#getEmployee_Name()}
     *   <li>{@link Employees#getId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Employees actualEmployees = new Employees();
        actualEmployees.setEmployee_Age("Employee Age");
        actualEmployees.setEmployee_Location("Employee Location");
        actualEmployees.setEmployee_Name("Employee Name");
        actualEmployees.setId(1);
        assertEquals("Employee Age", actualEmployees.getEmployee_Age());
        assertEquals("Employee Location", actualEmployees.getEmployee_Location());
        assertEquals("Employee Name", actualEmployees.getEmployee_Name());
        assertEquals(1, actualEmployees.getId());
    }
}


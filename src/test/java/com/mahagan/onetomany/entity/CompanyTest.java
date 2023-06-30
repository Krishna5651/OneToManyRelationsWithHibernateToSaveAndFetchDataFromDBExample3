package com.mahagan.onetomany.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CompanyTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Company}
     *   <li>{@link Company#setCompany_Location(String)}
     *   <li>{@link Company#setCompany_Name(String)}
     *   <li>{@link Company#setEmployees(List)}
     *   <li>{@link Company#setId(int)}
     *   <li>{@link Company#getCompany_Location()}
     *   <li>{@link Company#getCompany_Name()}
     *   <li>{@link Company#getEmployees()}
     *   <li>{@link Company#getId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Company actualCompany = new Company();
        actualCompany.setCompany_Location("Company Location");
        actualCompany.setCompany_Name("Company Name");
        ArrayList<Employees> employees = new ArrayList<>();
        actualCompany.setEmployees(employees);
        actualCompany.setId(1);
        assertEquals("Company Location", actualCompany.getCompany_Location());
        assertEquals("Company Name", actualCompany.getCompany_Name());
        assertSame(employees, actualCompany.getEmployees());
        assertEquals(1, actualCompany.getId());
    }
}


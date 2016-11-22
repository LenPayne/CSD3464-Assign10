/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package assign10;

import assign10.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testName() {
        System.out.println("name");
        Employee instance = new Employee();
        String expResult = "Bob";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Employee.
     */
    @Test
    public void testId() {
        System.out.println("id");
        Employee instance = new Employee();
        String expResult = "123-F";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHireDate method, of class Employee.
     */
    @Test
    public void testHireDate() {
        System.out.println("hireDate");
        Employee instance = new Employee();
        String expResult = "2015-11-27";
        instance.setHireDate(expResult);
        String result = instance.getHireDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of the Complete Constructor method, of class Employee
     */
    @Test
    public void testConstructor() {
        System.out.println("Employee(...)");
        String name = "Jim";
        String id = "321-D";
        String hireDate = "2015-10-31";
        Employee instance = new Employee(name, id, hireDate);
        assertEquals(name, instance.getName());
        assertEquals(id, instance.getId());
        assertEquals(hireDate, instance.getHireDate());
    }
    
}

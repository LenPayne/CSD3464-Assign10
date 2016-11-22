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

import assign10.ShiftSupervisor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class ShiftSupervisorTest {
    
    public ShiftSupervisorTest() {
    }
/**
     * Test of getName method, of class ShiftSupervisor.
     */
    @Test
    public void testName() {
        System.out.println("name");
        ShiftSupervisor instance = new ShiftSupervisor();        
        String expResult = "Bob";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class ShiftSupervisor.
     */
    @Test
    public void testId() {
        System.out.println("id");
        ShiftSupervisor instance = new ShiftSupervisor();
        String expResult = "123-F";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getHireDate method, of class ShiftSupervisor.
     */
    @Test
    public void testHireDate() {
        System.out.println("hireDate");
        ShiftSupervisor instance = new ShiftSupervisor();
        String expResult = "2015-11-27";
        instance.setHireDate(expResult);
        String result = instance.getHireDate();
        assertEquals(expResult, result);
    }

    
    /**
     * Test of getSalary method, of class ShiftSupervisor.
     */
    @Test
    public void testSalary() {
        System.out.println("salary");
        ShiftSupervisor instance = new ShiftSupervisor();
        double expResult = 40000.0;
        instance.setSalary(expResult);
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0001);        
    }    

    /**
     * Test of getBonusEarned method, of class ShiftSupervisor.
     */
    @Test
    public void testBonusEarned() {
        System.out.println("bonusEarned");
        ShiftSupervisor instance = new ShiftSupervisor();
        double expResult = 1500.0;
        instance.setBonusEarned(expResult);
        double result = instance.getBonusEarned();
        assertEquals(expResult, result, 0.0001);        
    }    
    
    /**
     * Test of the Complete Constructor method, of class ShiftSupervisor
     */
    @Test
    public void testConstructor() {
        System.out.println("ShiftSupervisor(...)");
        String name = "Jim";
        String id = "321-D";
        String hireDate = "2015-10-31";
        double salary = 35000;
        double bonusEarned = 1200;
        ShiftSupervisor instance = new ShiftSupervisor(name, id, hireDate, salary, bonusEarned);
        assertEquals(name, instance.getName());
        assertEquals(id, instance.getId());
        assertEquals(hireDate, instance.getHireDate());
        assertEquals(salary, instance.getSalary(), 0.001);
        assertEquals(bonusEarned, instance.getBonusEarned(), 0.001);        
    }
    
}

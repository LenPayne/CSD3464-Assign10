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

import assign10.ProductionWorker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class ProductionWorkerTest {
    
    public ProductionWorkerTest() {
    }

    /**
     * Test of getName method, of class ProductionWorker.
     */
    @Test
    public void testName() {
        System.out.println("name");
        ProductionWorker instance = new ProductionWorker();        
        String expResult = "Bob";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class ProductionWorker.
     */
    @Test
    public void testId() {
        System.out.println("id");
        ProductionWorker instance = new ProductionWorker();
        String expResult = "123-F";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getHireDate method, of class ProductionWorker.
     */
    @Test
    public void testHireDate() {
        System.out.println("hireDate");
        ProductionWorker instance = new ProductionWorker();
        String expResult = "2015-11-27";
        instance.setHireDate(expResult);
        String result = instance.getHireDate();
        assertEquals(expResult, result);
    }
    /**
     * Test of getShift method, of class ProductionWorker.
     */
    @Test
    public void testShift() {
        System.out.println("shift");
        ProductionWorker instance = new ProductionWorker();
        int expResult = 1;
        instance.setShift(expResult);
        int result = instance.getShift();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getHourlyRate method, of class ProductionWorker.
     */
    @Test
    public void testHourlyRate() {
        System.out.println("HourlyRate");
        ProductionWorker instance = new ProductionWorker();
        double expResult = 18.0;
        instance.setHourlyRate(expResult);
        double result = instance.getHourlyRate();
        assertEquals(expResult, result, 0.001);        
    }
    
    /**
     * Test of the Complete Constructor method, of class ProductionWorker
     */
    @Test
    public void testConstructor() {
        System.out.println("ProductionWorker(...)");
        String name = "Jim";
        String id = "321-D";
        String hireDate = "2015-10-31";
        int shift = 2;
        double hourlyRate = 13;
        ProductionWorker instance = new ProductionWorker(name, id, hireDate, shift, hourlyRate);
        assertEquals(name, instance.getName());
        assertEquals(id, instance.getId());
        assertEquals(hireDate, instance.getHireDate());
        assertEquals(shift, instance.getShift());
        assertEquals(hourlyRate, instance.getHourlyRate(), 0.001);
    }
    
}

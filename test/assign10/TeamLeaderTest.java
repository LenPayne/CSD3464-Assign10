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

import assign10.TeamLeader;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class TeamLeaderTest {

    public TeamLeaderTest() {
    }

    /**
     * Test of getName method, of class TeamLeader.
     */
    @Test
    public void testName() {
        System.out.println("name");
        TeamLeader instance = new TeamLeader();
        String expResult = "Bob";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class TeamLeader.
     */
    @Test
    public void testId() {
        System.out.println("id");
        TeamLeader instance = new TeamLeader();
        String expResult = "123-F";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHireDate method, of class TeamLeader.
     */
    @Test
    public void testHireDate() {
        System.out.println("hireDate");
        TeamLeader instance = new TeamLeader();
        String expResult = "2015-11-27";
        instance.setHireDate(expResult);
        String result = instance.getHireDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getShift method, of class TeamLeader.
     */
    @Test
    public void testShift() {
        System.out.println("shift");
        TeamLeader instance = new TeamLeader();
        int expResult = 1;
        instance.setShift(expResult);
        int result = instance.getShift();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHourlyRate method, of class TeamLeader.
     */
    @Test
    public void testHourlyRate() {
        System.out.println("HourlyRate");
        TeamLeader instance = new TeamLeader();
        double expResult = 18.0;
        instance.setHourlyRate(expResult);
        double result = instance.getHourlyRate();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getBonus method, of class TeamLeader.
     */
    @Test
    public void testBonus() {
        System.out.println("bonus");
        TeamLeader instance = new TeamLeader();
        double expResult = 1200.0;
        instance.setBonus(expResult);
        double result = instance.getBonus();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRequiredTraining method, of class TeamLeader.
     */
    @Test
    public void testRequiredTraining() {
        System.out.println("requiredTraining");
        TeamLeader instance = new TeamLeader();
        int expResult = 10;
        instance.setRequiredTraining(expResult);
        int result = instance.getRequiredTraining();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAttendedTraining method, of class TeamLeader.
     */
    @Test
    public void testAttendedTraining() {
        System.out.println("attendedTraining");
        TeamLeader instance = new TeamLeader();
        int expResult = 8;
        instance.setAttendedTraining(expResult);
        int result = instance.getAttendedTraining();
        assertEquals(expResult, result);
    }

    /**
     * Test of the Complete Constructor method, of class TeamLeader
     */
    @Test
    public void testConstructor() {
        System.out.println("TeamLeader(...)");
        String name = "Jim";
        String id = "321-D";
        String hireDate = "2015-10-31";
        int shift = 2;
        double hourlyRate = 13;
        double bonus = 1250;
        int required = 11;
        int attended = 7;
        TeamLeader instance = new TeamLeader(name, id, hireDate, shift, hourlyRate, bonus, required, attended);
        assertEquals(name, instance.getName());
        assertEquals(id, instance.getId());
        assertEquals(hireDate, instance.getHireDate());
        assertEquals(shift, instance.getShift());
        assertEquals(hourlyRate, instance.getHourlyRate(), 0.001);
        assertEquals(bonus, instance.getBonus(), 0.001);
        assertEquals(required, instance.getRequiredTraining());
        assertEquals(attended, instance.getAttendedTraining());
    }
}

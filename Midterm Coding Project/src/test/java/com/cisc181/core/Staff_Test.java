package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.Date;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	
	static ArrayList<Staff> staffers = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws PersonException {
		Staff st = new Staff(eTitle.MR);
		st.setSalary(10000);
		Staff st2 = new Staff(eTitle.MR);
		st2.setSalary(20000);
		Staff st3 = new Staff(eTitle.MR);
		st3.setSalary(30000);
		Staff st4 = new Staff(eTitle.MR);
		st4.setSalary(40000);
		Staff st5 = new Staff(eTitle.MR);
		st5.setSalary(50000);
		staffers.add(st);
		staffers.add(st2);
		staffers.add(st3);
		staffers.add(st4);
		staffers.add(st5);
		
		
		
	}
	
	@Test
	public void test() throws PersonException {
		double avg = 0;
		for(Staff st: staffers) {
			avg += st.getSalary()/5;
		}
		
		Assert.assertEquals(30000.0, avg, .01);
	}	
	
	@Test
	public void test2() throws PersonException {
		try {
			Date d = java.sql.Date.valueOf("1999-11-19");
			Date d2 = java.sql.Date.valueOf("1990-07-15");
			Staff st = new Staff("p", "j", "Dan", d, "153 GL", "111-222-333", "fake@gmail.com", "Offhour", 2, 20000, d2, eTitle.MR);
		}
		catch (PersonException e) {
			Assert.assertEquals(1.0, 1.0, 0.01);
			//Test passes if Person Exception is throw, if other exception is thrown assert will fail
		}
		catch (Exception e) {
			Assert.assertEquals(1.0, 0.01, 0.01);
		}
	}

}

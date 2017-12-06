package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
		//create empty array lists
		static ArrayList<Course> Courses = new ArrayList<Course>();
		static ArrayList<Semester> Semesters = new ArrayList<Semester>();
		static ArrayList<Section> Sections = new ArrayList<Section>();
		static ArrayList<Student> Students = new ArrayList<Student>();
		static ArrayList<Enrollment> ClassMembers = new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void setUp() throws Exception{
				
		//add courses
		Course CISC181 = new Course(UUID.randomUUID(), null, 0, null);
		Courses.add(CISC181);
		Course CHEM100 = new Course(UUID.randomUUID(), null, 0, null);
		Courses.add(CHEM100);
		Course MATH300 = new Course(UUID.randomUUID(), null, 0, null);
		Courses.add(MATH300);
		
		//add semesters
		Semester FallS = new Semester(UUID.randomUUID());
		Semesters.add(FallS);
		Semester SpringS = new Semester(UUID.randomUUID());
		Semesters.add(SpringS);
		
		//add sections
		for(Course c : Courses) {
			for(Semester s : Semesters) {
				Sections.add(new Section(c.getCourseID(),s.getSemesterID()));
			}
		}
		
		//add students
		
		
		Students.add(new Student("Joe","A","D",eMajor.CHEM, "0","000-000-0000","jd@mail"));
		Students.add(new Student("Bob","B","D",eMajor.COMPSI, "1","111-000-0000","bd@mail"));
		Students.add(new Student("John","C","D",eMajor.NURSING, "2","222-000-0000","jd@mail"));
		Students.add(new Student("Mike","D","D",eMajor.CHEM, "3","333-000-0000","md@mmail"));
		Students.add(new Student("Bo","E","D",eMajor.BUSINESS, "4","444-000-0000","bd1@mail"));
		Students.add(new Student("Ray","F","D",eMajor.BUSINESS, "5","555-000-0000","rd@mail"));
		Students.add(new Student("Matt","G","D",eMajor.COMPSI, "6","666-000-0000","md2@mail"));
		Students.add(new Student("Alex","H","D",eMajor.NURSING, "7","777-000-0000","ad@mail"));
		Students.add(new Student("Jess","I","D",eMajor.CHEM, "8","888-000-0000","jd@mail"));
		Students.add(new Student("Lindsay","J","D",eMajor.BUSINESS, "9","999-000-0000","ld@mail"));
		
		
}
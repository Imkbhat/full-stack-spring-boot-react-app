package com.luv2code.reactspringbootcrud.reactspringbootcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.reactspringbootcrud.reactspringbootcrud.model.Course;

@Service
public class CoursesHardcodedService {
	
		private static List<Course> courseList = new ArrayList<Course>();
		private static long idCounter = 0;
		static{
			courseList.add(new Course(++idCounter, "Kiran", "React"));
			courseList.add(new Course(++idCounter, "Kiran", "Spring Boot"));
			courseList.add(new Course(++idCounter, "Kiran", "Angular"));
			courseList.add(new Course(++idCounter, "Kiran", "Docker"));
		}
		
		public List<Course> findAll() {
			return courseList;
		}
		
		public Course save(Course course) {
		    if (course.getId() == -1 || course.getId() == 0) {
		      course.setId(++idCounter);
		      courseList.add(course);
		    } else {
		      deleteById(course.getId());
		      courseList.add(course);
		    }
		    return course;
		  }

		  public Course deleteById(long id) {
		    Course course = findById(id);

		    if (course == null)
		      return null;

		    if (courseList.remove(course)) {
		      return course;
		    }

		    return null;
		  }

		  public Course findById(long id) {
		    for (Course course : courseList) {
		      if (course.getId() == id) {
		        return course;
		      }
		    }

		    return null;
		  }
}

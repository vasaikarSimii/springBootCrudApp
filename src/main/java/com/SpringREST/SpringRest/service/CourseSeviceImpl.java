package com.SpringREST.SpringRest.service;

import com.SpringREST.SpringRest.entities.Course;
import com.SpringREST.SpringRest.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseSeviceImpl implements CourseService{

    List<Course> courseList;
    @Autowired
    private CourseRepository courseRepository;

    public CourseSeviceImpl() {

    }

    @Override
    public List<Course> getCourses() {
        courseList = courseRepository.findAll();
        return courseList;
    }

    @Override
    public Course getCourseByID(Long courseId) {
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        return courseOptional.orElseThrow(
                () -> new RuntimeException("Course not found with ID: " + courseId)
        );
    }

    @Override
    public Course addCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public void deleteCourse(Long courseId) {
       courseRepository.deleteById(courseId);
    }
}

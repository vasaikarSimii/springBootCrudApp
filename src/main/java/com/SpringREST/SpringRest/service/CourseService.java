package com.SpringREST.SpringRest.service;

import com.SpringREST.SpringRest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CourseService {

    public List<Course> getCourses();
    public Course getCourseByID(Long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);

    public void deleteCourse(Long courseId);

}

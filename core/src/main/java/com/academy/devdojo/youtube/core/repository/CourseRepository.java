package com.academy.devdojo.youtube.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.academy.devdojo.youtube.core.model.Course;

/**
 * @author pedroRhamon
 *
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}

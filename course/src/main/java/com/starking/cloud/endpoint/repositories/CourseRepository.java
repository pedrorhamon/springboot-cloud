package com.starking.cloud.endpoint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starking.cloud.endpoint.model.Course;

/**
 * @author pedroRhamon
 *
 */
public interface CourseRepository extends JpaRepository<Course, Long>{

}

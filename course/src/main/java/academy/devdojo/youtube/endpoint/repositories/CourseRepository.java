package academy.devdojo.youtube.endpoint.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import academy.devdojo.youtube.endpoint.model.Course;

/**
 * @author pedroRhamon
 *
 */
public interface CourseRepository extends JpaRepository<Course, Long>{

}

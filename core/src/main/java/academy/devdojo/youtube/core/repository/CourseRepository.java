package academy.devdojo.youtube.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import academy.devdojo.youtube.core.model.Course;

/**
 * @author pedroRhamon
 *
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}

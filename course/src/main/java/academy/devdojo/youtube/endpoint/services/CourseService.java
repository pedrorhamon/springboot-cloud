package academy.devdojo.youtube.endpoint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.academy.devdojo.youtube.core.model.Course;
import com.academy.devdojo.youtube.core.repository.CourseRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author pedroRhamon
 *
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

	private final CourseRepository repository;
	
	public Iterable<Course> list(Pageable pageable) {
		log.info("Listing all courses");
		return this.repository.findAll(pageable);
	}
}

package academy.devdojo.youtube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.academy.devdojo.youtube.core.property.JwtConfiguration;

@SpringBootApplication
@EntityScan({"com.academy.devdojo.youtube.core.repository"})
@EnableJpaRepositories({"com.academy.devdojo.youtube.core.repository"})
@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("com.academy.devdojo.youtube")
public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
	}

}

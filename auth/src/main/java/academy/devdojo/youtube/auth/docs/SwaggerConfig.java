package academy.devdojo.youtube.auth.docs;

import org.springframework.context.annotation.Configuration;

import com.academy.devdojo.youtube.core.docs.BaseSwaggerConfig;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author pedroRhamon
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    public SwaggerConfig() {
        super("academy.devdojo.youtube.auth.endpoint.controller");
    }
}

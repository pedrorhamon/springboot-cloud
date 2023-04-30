package academy.devdojo.youtube.security.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.academy.devdojo.youtube.core.property.JwtConfiguration;

import academy.devdojo.youtube.token.security.config.SecurityTokenConfig;
import academy.devdojo.youtube.token.security.filter.JwtTokenAuthorizationFilter;
import academy.devdojo.youtube.token.security.token.converter.TokenConverter;

/**
 * @author pedroRhamon
 *
 */
@EnableWebSecurity
public class SecurityCredentialsConfig extends SecurityTokenConfig {
    private final TokenConverter tokenConverter;

    public SecurityCredentialsConfig(JwtConfiguration jwtConfiguration, TokenConverter tokenConverter) {
        super(jwtConfiguration);
        this.tokenConverter = tokenConverter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterAfter(new JwtTokenAuthorizationFilter(jwtConfiguration, tokenConverter), UsernamePasswordAuthenticationFilter.class);
        super.configure(http);
    }

}

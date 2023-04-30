package academy.devdojo.youtube.gateway.security.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.academy.devdojo.youtube.core.property.JwtConfiguration;

import academy.devdojo.youtube.gateway.security.filter.GatewayJwtTokenAuthorizationFilter;
import academy.devdojo.youtube.token.security.config.SecurityTokenConfig;
import ch.qos.logback.core.rolling.helper.TokenConverter;

/**
 * @author pedroRhamon
 *
 */
@EnableWebSecurity
public class SecurityConfig extends SecurityTokenConfig {
    private final TokenConverter tokenConverter;

    public SecurityConfig(JwtConfiguration jwtConfiguration, TokenConverter tokenConverter) {
        super(jwtConfiguration);
        this.tokenConverter = tokenConverter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterAfter(new GatewayJwtTokenAuthorizationFilter(jwtConfiguration, tokenConverter), UsernamePasswordAuthenticationFilter.class);
        super.configure(http);
    }
}

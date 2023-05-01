package academy.devdojo.youtube.auth;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author pedroRhamon
 *
 */
@SpringBootTest
public class AuthApplicationTests {
	
	@Test
	public void contextLoads() {}
	
	public void test() {
		System.out.println(new BCryptPasswordEncoder().encode("pedrorhamon"));
	}

}

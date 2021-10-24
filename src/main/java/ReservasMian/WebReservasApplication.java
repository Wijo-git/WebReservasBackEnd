package ReservasMian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Modelo"})
public class WebReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebReservasApplication.class, args);
	}

}

package G37.CesarTorres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"G37.CesarTorres.Modelo"})
public class CesarTorresApplication {

	public static void main(String[] args) {
		SpringApplication.run(CesarTorresApplication.class, args);
	}

}
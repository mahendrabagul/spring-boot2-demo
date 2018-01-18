package info.mahendrabagul.artajaspringboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("info.mahendrabagul.artajaspringboot1.data")
@EntityScan("info.mahendrabagul.artajaspringboot1.model")
public class ArtajaSpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(ArtajaSpringBoot1Application.class, args);
	}
}

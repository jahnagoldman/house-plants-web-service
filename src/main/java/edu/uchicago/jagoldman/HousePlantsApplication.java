package edu.uchicago.jagoldman;

import edu.uchicago.jagoldman.domain.Plant;
import edu.uchicago.jagoldman.domain.Type;
import edu.uchicago.jagoldman.repository.TypeRepository;
import edu.uchicago.jagoldman.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SportsVansApplication implements CommandLineRunner {

	@Autowired
	private VanRepository vanRepository;

	@Autowired
	private TypeRepository typeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SportsVansApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Type[] types = new Type[3];
		types[0] = new Type("Mercedes Benz");
		types[1] = new Type("Dodge");
		types[2] = new Type("Ford");

		typeRepository.save(Arrays.asList(types));

		Plant[] plants = new Plant[5];
		plants[0] = new Plant("RB Low top", "151 inch wheel base with Diesel, perfect for a 4x4 penthouse will go anywhere.", types[0], "http://www.ujointoffroad.com/images/410_100_1245.JPG");
		plants[1] = new Plant("EB High top", "170 inch wheel base with high top with Diesel. Ideal for an executive experience.", types[0], "http://www.ujointoffroad.com/images/410_100_1245.JPG");
		plants[2] = new Plant("Promaster Low top", "Gas engine very quiet. European design based on the Ducato chasis. Extreme stealth", types[1], "http://www.ujointoffroad.com/images/410_100_1245.JPG");
		plants[3] = new Plant("Promaster High top", "Gas engine very quiet. Wider than sprinter. European design based on the Ducato chasis.", types[1], "http://www.ujointoffroad.com/images/410_100_1245.JPG");
		plants[4] = new Plant("Ford Transit", "Gas engine very quiet. Reliable engine.", types[2], "http://www.ujointoffroad.com/images/410_100_1245.JPG");

		vanRepository.save(Arrays.asList(plants));


	}
}

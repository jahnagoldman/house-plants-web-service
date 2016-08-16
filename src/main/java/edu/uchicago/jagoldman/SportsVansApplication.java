package edu.uchicago.jagoldman;

import edu.uchicago.jagoldman.domain.Make;
import edu.uchicago.jagoldman.domain.Van;
import edu.uchicago.jagoldman.repository.MakeRepository;
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
	private MakeRepository makeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SportsVansApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Make[] makes = new Make[3];
		makes[0] = new Make("Mercedes Benz");
		makes[1] = new Make("Dodge");
		makes[2] = new Make("Ford");

		makeRepository.save(Arrays.asList(makes));

		Van[] vans = new Van[5];
		vans[0] = new Van("RB Low top", "151 inch wheel base with Diesel, perfect for a 4x4 penthouse will go anywhere.", makes[0], "http://www.ujointoffroad.com/images/410_100_1245.JPG");
		vans[1] = new Van("EB High top", "170 inch wheel base with high top with Diesel. Ideal for an executive experience.", makes[0], "http://www.ujointoffroad.com/images/372_Mcmullen_3_4.jpg");
		vans[2] = new Van("Promaster Low top", "Gas engine very quiet. European design based on the Ducato chasis. Extreme stealth", makes[1], "http://www.ujointoffroad.com/images/410_100_1245.JPG");
		vans[3] = new Van("Promaster High top", "Gas engine very quiet. Wider than sprinter. European design based on the Ducato chasis.", makes[1], "http://www.ujointoffroad.com/images/410_100_1245.JPG");
		vans[4] = new Van("Ford Transit", "Gas engine very quiet. Reliable engine.", makes[2], "http://image.fourwheeler.com/f/16432877+w660  froad.com/images/410_100_1245.JPG");

		vanRepository.save(Arrays.asList(vans));


	}
}

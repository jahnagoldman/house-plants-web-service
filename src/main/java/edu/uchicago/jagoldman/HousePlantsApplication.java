package edu.uchicago.jagoldman;

import edu.uchicago.jagoldman.domain.Plant;
import edu.uchicago.jagoldman.domain.Type;
import edu.uchicago.jagoldman.repository.TypeRepository;
import edu.uchicago.jagoldman.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HousePlantsApplication implements CommandLineRunner {

	@Autowired
	private PlantRepository plantRepository;

	@Autowired
	private TypeRepository typeRepository;

	public static void main(String[] args) {
		SpringApplication.run(HousePlantsApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Type[] types = new Type[3];
		types[0] = new Type("Succulent");
		types[1] = new Type("Tree");
		types[2] = new Type("Flowering");

		typeRepository.save(Arrays.asList(types));

		Plant[] plants = new Plant[8];
		plants[0] = new Plant("Aloe", "Long pointed leaves and has medicinal properties. Great for sunny indoor spaces.", "Keep in temperatures around 70 degrees and heavy sunlight. Avoid watering too frequently. ", types[0], "http://st.hzcdn.com/simgs/4be23f36069a53c8_8-4579/home-design.jpg");
		plants[1] = new Plant("Jade Plant", "Thick lush leaves. Grows slowly and lives a long time. ", "Keep soil dry and keep in bright light and room temperature spaces.", types[0],  "http://www.gardeningknowhow.com/wp-content/uploads/2010/01/jade-plants1.jpg");
		plants[2] = new Plant("Snake Plant", "Upright variegated leaves. Leaves may have yellow or white edges.", "Keep air and soil dry. Normal room temperature is acceptable. ",types[0], "http://www.gardeningknowhow.com/wp-content/uploads/2012/03/mother-in-laws-snake-plant.jpg");
		plants[3] = new Plant("Ficus", "Tree with shiny leaves and drooping branches. Also called the Benjamin's fig or Weeping fig tree. ", "Likes sunlight and room temperatures between 65 and 75 degrees. Several days of dry soil between watering is usually preferred. ", types[1], "http://media2.s-nbcnews.com/j/newscms/2016_06/970781/ficus_b230668cff3fc0537256196f699e02f7.today-inline-large2x.jpg");
		plants[4] = new Plant("Parlor Palm", "Has green leaflets that are straplike and grow on feathery fronds. Usually are 1-8 feet high. ", "Medium to low light and evenly moist soil is preferred. They can get by on lower light than other palms. ",types[1], "http://ponsetilandscaping.com/wp-content/uploads/2013/08/parlor-palm.jpg");
		plants[5] = new Plant("Rubber Tree", "Easy to grow and can grow to 8 feet. Has very shiny leaves. ", "In between watering, the soil should become dry. Medium to bright light and temperatures from 60-80 are preferred. ", types[1], "https://s-media-cache-ak0.pinimg.com/236x/ff/e8/ee/ffe8eebbfce9643514d4ae5ca08f6130.jpg");
		plants[6] = new Plant("Shamrock Plant", "Bright green leaves that look like shamrocks and white flowers that grow on tall stems.", "Prefers bright but indirect light. Water about once per week, allowing the soil to dry out somewhat. ",types[2], "http://www.bristolfarms.com/blog/wp-content/uploads/2014/03/shamrock1.jpg");
		plants[7] = new Plant("Peace Lily", "Dark green leaves and beautiful white flowers. Inexpensive and helps filter the air. ", "Prefers low light and humidity. Likes moist soil and average temperatures up to 85 degrees. ", types[2], "http://thefamilytreeinc.com/wp-content/uploads/2016/02/Peace-Lily-6.jpg");

		plantRepository.save(Arrays.asList(plants));


	}
}

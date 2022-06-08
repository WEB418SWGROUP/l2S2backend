package web418.project.ServiceHub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import web418.project.ServiceHub.model.Packages;
import web418.project.ServiceHub.repository.PackageRepo;

@SpringBootApplication
public class ServiceHubApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHubApplication.class, args);
	}
	@Autowired
    private PackageRepo packageRepo;

@Override
	public void run(String... args) throws Exception{
		Packages gold = new Packages();
		gold.setPackId(1);
		gold.setPackaccess(100);
		gold.setDescription("This is gold package . This package is nice. It has good features. It has great features such access 100+ account per month, 10+ templates ,google.It is suitable for medium scale businesses. Subscribe and enjoy!");
		gold.setGcal(true);
		gold.setGmap(false);
		gold.setPrice(400);
		gold.setPackname("Gold");
		gold.setTemplate(10);
		packageRepo.save(gold);

	Packages platinum = new Packages();
	platinum.setPackId(2);
	platinum.setPackaccess(1000);
	platinum.setDescription("This is platinum package . This package is nice. It has premium features. This is the best seller. It has great features such access unlimited account access, 15+ templates ,google map and calendar. Subscribe and enjoy!");
	platinum.setGcal(true);
	platinum.setGmap(true);
	platinum.setPrice(500);
	platinum.setPackname("Platinum");
	platinum.setTemplate(15);
	packageRepo.save(platinum);

	Packages silver = new Packages();
	silver.setPackId(3);
	silver.setPackaccess(50);
	silver.setDescription("This is silver package . This package is nice. It has good features. It has great features such access 50+ account per month, 5+ templates ,google.It is suitable for small scale businesses. Subscribe and enjoy!");
	silver.setGmap(false);
	silver.setGcal(false);
	silver.setPrice(300);
	silver.setPackname("Silver");
	silver.setTemplate(5);
	packageRepo.save(silver);
	}


}

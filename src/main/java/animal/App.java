package animal;

import animal.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    private final AnimalRepository animalRepository;

    @Autowired
    public App(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        animalRepository.findAnimalsByName("Perro").forEach(System.out::println);
    }
}

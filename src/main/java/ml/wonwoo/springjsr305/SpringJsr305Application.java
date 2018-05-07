package ml.wonwoo.springjsr305;

import ml.wonwoo.springjsr305.domain.Person;
import ml.wonwoo.springjsr305.domain.PersonRepository;
import ml.wonwoo.springjsr305.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;

import java.util.Arrays;

@SpringBootApplication
public class SpringJsr305Application {

  public SpringJsr305Application(@Nullable PersonService personService) {
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringJsr305Application.class, args);
  }

  @Bean
  ApplicationRunner databaseInit(PersonRepository personRepository) {
    return args-> personRepository.saveAll(
        Arrays.asList(new Person("wonwoo"), new Person(null)));
  }


  @Bean
  ApplicationRunner applicationRunner(@Nullable PersonService personService) {
    return args -> {
    };
  }
}

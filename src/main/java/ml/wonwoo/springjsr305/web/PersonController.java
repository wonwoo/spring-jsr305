package ml.wonwoo.springjsr305.web;

import ml.wonwoo.springjsr305.domain.Person;
import ml.wonwoo.springjsr305.domain.PersonRepository;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;

@RestController
public class PersonController {

  private final PersonRepository personRepository;

  public PersonController(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @GetMapping("/")
  public String hello(@RequestParam @Nullable String name) {
    return "hello " + name + "!";
  }

  @GetMapping("/hello")
  public Person helloName(String name) {
    return personRepository.findByName(name);
  }

  @GetMapping("/hi")
  public Person helloNameLike(String name) {
    return personRepository.findByNameIsLike(name);
  }

}

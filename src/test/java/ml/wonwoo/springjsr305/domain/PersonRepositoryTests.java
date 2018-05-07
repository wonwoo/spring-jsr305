package ml.wonwoo.springjsr305.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class PersonRepositoryTests {

  @Autowired
  private PersonRepository personRepository;

  @Test
  public void nulltest() {
    Person byName = personRepository.findByName("test");
    System.out.println(byName);
  }

}
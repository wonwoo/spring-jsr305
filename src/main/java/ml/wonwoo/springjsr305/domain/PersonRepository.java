package ml.wonwoo.springjsr305.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

public interface PersonRepository extends JpaRepository<Person, Long> {

  Person findByNameIsLike(@Nullable String name);

  @Nullable
  Person findByName(String name);
}

package ml.wonwoo.springjsr305.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Endpoint(id = "hello")
@Component
public class HelloEndpoint {

  @ReadOperation
  public String hello(@Nullable String name) {
    return "hello " + name + "!";
  }
}

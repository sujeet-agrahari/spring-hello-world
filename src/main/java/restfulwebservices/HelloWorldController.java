package restfulwebservices;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@Validated
@RequestMapping("/api")
public class HelloWorldController {

  @GetMapping("/hello-world")
  public HelloWorldBean getMethodName(@Valid @ModelAttribute HelloWorldRequestDTO requestDTO) {
    return new HelloWorldBean(requestDTO);
  }

}

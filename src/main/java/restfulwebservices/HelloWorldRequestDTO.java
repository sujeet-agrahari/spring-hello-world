package restfulwebservices;


import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Setter;
import lombok.ToString;
import lombok.Data;
import lombok.Getter;

@Getter
@Setter
@ToString
@Data
@Validated
public class HelloWorldRequestDTO {

  @NotBlank
  private String message;

  @NotBlank
  private String firstName;

  @NotBlank
  @NotNull 
  @NotEmpty
  private String lastName;
}

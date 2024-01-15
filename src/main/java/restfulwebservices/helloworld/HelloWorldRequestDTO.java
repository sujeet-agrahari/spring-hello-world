package restfulwebservices.helloworld;



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
public class HelloWorldRequestDTO {
  private String name;
  HelloWorldRequestDTO(String nameString) {
    this.name = nameString;
  }
  @NotBlank
  private String message;

  @NotBlank
  private String firstName;

  @NotBlank
  @NotNull 
  @NotEmpty
  private String lastName;
}

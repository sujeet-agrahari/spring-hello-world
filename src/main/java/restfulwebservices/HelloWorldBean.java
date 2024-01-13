package restfulwebservices;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

public class HelloWorldBean {

  @Getter
  private String message;
  private String firstName;
  private String lastName;

  public HelloWorldBean(HelloWorldRequestDTO requestDTO) {
    this.message = requestDTO.getMessage();
    this.firstName = requestDTO.getFirstName();
    this.lastName = requestDTO.getLastName();
  }

    @JsonProperty("greeting")
    public String getGreet() {
        return "Hi, " + firstName + " " + lastName + ", here is your message: " + message;
    }

}

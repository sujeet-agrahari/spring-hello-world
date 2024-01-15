package restfulwebservices.helloworld;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

public class HelloWorldBean {

  @Getter
  private String message;
  private String firstName;
  private String lastName;
  private String name;

  public HelloWorldBean(HelloWorldRequestDTO requestDTO) {
    this.message = requestDTO.getMessage();
    this.firstName = requestDTO.getFirstName();
    this.lastName = requestDTO.getLastName();
  }

  public HelloWorldBean(String name) {
    this.name = name;
  }

    @JsonProperty("greeting")
    public String getGreet() {
        return "Hi, " + firstName + " " + lastName + ", here is your message: " + message + name;
    }

    public String getName() {
        return name;
    }

}

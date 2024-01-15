package restfulwebservices.user;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class User {
  private Integer id;
  private String name;
  private Date birthDate;
}

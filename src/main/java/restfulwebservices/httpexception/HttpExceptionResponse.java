package restfulwebservices.httpexception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HttpExceptionResponse {
  private Date timestamp;
  private String message;
  private String details;
}

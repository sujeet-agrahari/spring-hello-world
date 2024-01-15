package restfulwebservices.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import restfulwebservices.httpexception.NotFoundException;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class UserController {
  @Autowired
  private UserDAOService userDAOService;

  @GetMapping("/users")
  public List<User> getUsers() {
      return userDAOService.findAll();
  }

  @GetMapping("/users/{id}")
  public User getUser(@PathVariable Integer id) {
      User user =  userDAOService.findById(id);
      if (user == null) {
        throw new NotFoundException("User not found with id " + id);
      }
      return user;
  }

  @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
     User createdUser =  userDAOService.save(user);

     URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdUser.getId()).toUri();
     return ResponseEntity.created(location).body(createdUser);
  }

  @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Integer id) {
      User user = userDAOService.deleteUserById(id);
      if (user == null) {
        throw new NotFoundException("User not found with id " + id);
      }
      return ResponseEntity.ok().body(user);
  }
}

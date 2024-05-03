package hello.springmvc.basic.requestMapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class mappingClassController {

    @GetMapping("/mapping/users")
    public String user() {
        return "get User";
    }

    @PostMapping("/mapping/users")
    String addUser() {
        System.out.println("들어오김한 ?");
        return "post User";
    }

    @GetMapping("/mapping/users/{userId}")
    String findUser(@PathVariable String userId) {
        return "getUserID = " + userId;
    }

    @PatchMapping("/mapping/users/{userId}")
    String updateUser(@PathVariable String userId) {
        return "updateUser = " + userId;
    }

    @DeleteMapping("/mapping/users/{userId}")
    String deleteUser(@PathVariable String userId) {
        return "DeleteUser" + userId;
    }

}

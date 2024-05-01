package hello.springmvc.basic.requestMapping;

import org.springframework.web.bind.annotation.*;

@RestController("/mapping/users")
public class mappingClassController {

    @GetMapping
    public String user() {
        return "get User";
    }

    @PostMapping
    String addUser() {
        System.out.println("들어오김한 ?");
        return "post User";
    }

    @GetMapping("/{userId}")
    String findUser(@PathVariable String userId) {
        return "getUserID = " + userId;
    }

    @PatchMapping("/{userId}")
    String updateUser(@PathVariable String userId) {
        return "updateUser = " + userId;
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId) {
        return "DeleteUser" + userId;
    }

}

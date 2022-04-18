package blog.blogpost.blog.controller;

import blog.blogpost.blog.model.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    // save / add a user
    @PostMapping("/add")
    public ResponseEntity<?> saveUser(@RequestBody Profile profile){

        return null;
    }

    // get a signle user
    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") String id){
        return null;
    }

    public ResponseEntity<?> getAllUser(){
        return null;
    }

    @PostMapping("/edit")
    public ResponseEntity<?> editUser(@RequestBody Profile profile){
        return null;
    }


}

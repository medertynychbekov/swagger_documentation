package com.example.swagger_documentation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Tag(name = "user controller")
public class UserController {

    @GetMapping("/get")
    @Operation(description = "this method for getting some text")
    public String method() {
        return "hello world from swagger application!!!";
    }

    @PostMapping("/post_text")
    @Operation(description = "some method for returning the text from parameter")
    public String someMethod(@RequestParam String text) {
        return text;
    }

    @PutMapping("/put_text")
    @Operation(description = "second some method with type PUT")
    public String secondSomeMethod(@RequestBody String text) {
        return text;
    }

    @DeleteMapping("/delete/{id}")
    @Operation(description = "this method needs for delete the User object")
    public void delete(@PathVariable int id) {
        System.out.println(id);
    }
}

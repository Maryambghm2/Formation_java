package org.example.demorest.controller;

import org.example.demorest.dto.UserReceiveDto;
import org.example.demorest.dto.UserResponseDto;
import org.example.demorest.entity.User;
import org.example.demorest.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<UserResponseDto> getById(@PathVariable long id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> create(@RequestBody UserReceiveDto user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

    @PutMapping("{id}")
    public ResponseEntity<UserResponseDto> update(@PathVariable long id, @RequestBody UserReceiveDto user) {
        return ResponseEntity.ok(userService.update(id, user));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        userService.delete(id);
        return ResponseEntity.ok(String.format("User at id : %s is deleted", id));
    }
}

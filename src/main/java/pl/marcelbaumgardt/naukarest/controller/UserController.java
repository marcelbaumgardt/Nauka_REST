package pl.marcelbaumgardt.naukarest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.marcelbaumgardt.naukarest.model.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private List<User> users;

    @PostConstruct
    void init(){
        users=new ArrayList<>();
        users.add( new User("cosmo123", "marcelidt1994@gamil.com", 24,"detale"));
        users.add( new User("cosmo124", "marcelidt1995@gamil.com", 28,"detale1"));
        users.add( new User("cosmo124", "marcelidt1995@gamil.com", 32,"detale1"));
        users.add( new User("cosmo124", "marcelidt1995@gamil.com", 40,"detale1"));
    }

    @GetMapping("/users/{id}")
    public User getUsers(@PathVariable(required = false) int id){
        return users.get(id - 1);
    }

    @GetMapping("/users")
    public List<User> getListOfUsers(@RequestParam(required = false) String age){
        if ("asc".equals(age)) {
            return users.stream().sorted((u1, u2) -> {
                return u1.getAge().compareTo(u2.getAge());
            }).collect(Collectors.toList());
        }
        else if("desc".equals(age)){
//            users.stream().sorted((u1,u2)-> {return -1*u1.getAge().compareTo(u2.getAge());}).collect(Collectors.toList());
            return users.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
        }
        else {
            return users;
        }
    }

    @GetMapping("/user")
    public User get(){
        return new User("cosmo123", "marcelidt1994@gamil.com", 24,"detale");
    }

    @PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        users.add(user);
    }



}

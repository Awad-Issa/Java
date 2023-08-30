package com.example.hellohuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HelloHuman {
  @GetMapping("/")
  public String index(@RequestParam(value="q", required = false) String searchQuery) {
    if (searchQuery == null){return "Hello Human";}
    return "Hello " + searchQuery;
  }

}

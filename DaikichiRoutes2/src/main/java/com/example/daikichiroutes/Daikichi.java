package com.example.daikichiroutes;

import java.security.SecureRandom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Daikichi {
@GetMapping ("/Daikichi")
  public String Daikichi(){
  return "Welcome!";
  }
  @GetMapping("/Daikichi/today")
  public String DaikichiToday(){
  return "Today you will find luck in all your endeavor!";
  }
  @GetMapping("/Daikichi/tomorrow")
  public String DaikichiTomorrow() {
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
  }


}

package com.example.ninjagold;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

@RequestMapping("/")
  public String index(Model model){
  model.addAttribute("gold",0);
  model.addAttribute("activities",new ArrayList<String>());
  return "index.jsp";
}

@RequestMapping("/ninjaPost")
  public String processGold(@RequestParam("location")String location, Model model){

  Random rand = new Random();
  int goldEarned = 0;
  List<String >activities = new ArrayList<>();

  if (location == "farm"){goldEarned = rand.nextInt(11) + 10;}
  else if (location == "cave") {goldEarned = rand.nextInt(6) + 5;}
  else if (location =="house") {goldEarned = rand.nextInt(4) + 2;}
  else if (location == "quest") {goldEarned = rand.nextInt(101) - 50;}

  int currentGold = (int)model.getAttribute("gold");
  model.addAttribute("gold",currentGold + goldEarned);

  LocalDateTime timestamp = LocalDateTime.now();
  activities = (List<String>) model.getAttribute("activities");
  activities.add("Earned " + goldEarned + " gold at " + location + " (" + timestamp + ")");
  model.addAttribute("activities", activities);

  return "redirect:/";
}
}

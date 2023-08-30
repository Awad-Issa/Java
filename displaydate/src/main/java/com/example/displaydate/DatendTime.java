package com.example.displaydate;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.springframework.ui.Model;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DatendTime {

  @RequestMapping("/")
  public String landingPage(){
    return "landingPage.jsp";
  }

  @RequestMapping("/date")
  public String data(Model model) {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    model.addAttribute("date", date);
    return "Date.jsp";
  }

  @RequestMapping("/time")
  public String time(Model model) {
    Time time = Time.valueOf(LocalTime.now());
    model.addAttribute("time", time);
    return "Time.jsp";
  }

}

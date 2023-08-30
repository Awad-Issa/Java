package com.example.counter;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {

  @RequestMapping("/counter")
  public String counter(HttpSession session) {

    Integer num = 0;
    if (session.getAttribute("num") ==null) {
      session.setAttribute("num", 0);

    } else {
      num = (Integer) session.getAttribute("num");
      num++;
      session.setAttribute("num", num);
    }
    return "counter.jsp";
  }

  @RequestMapping("/")
  public String welcomeUser() {
    return "welcomeUser.jsp";
  }


}

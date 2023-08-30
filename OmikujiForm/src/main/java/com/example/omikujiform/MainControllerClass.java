package com.example.omikujiform;

import jakarta.servlet.http.HttpSession;
import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllerClass {



  @RequestMapping("/omikuji")
  public String formPage(){
    return "form.jsp";
  }

  @RequestMapping("/omikuji/show")
  public String showPage(
      @RequestParam(value ="number") String number,
      @RequestParam(value ="cityName") String cityName,
      @RequestParam(value ="personName") String personName,
      @RequestParam(value ="hobby") String hobby,
      @RequestParam(value ="livingType") String livingType,
      @RequestParam(value ="somethingToSay") String somethingToSay,
      HttpSession session){

    session.setAttribute("number", number);
    session.setAttribute("cityName", cityName);
    session.setAttribute("personName", personName);
    session.setAttribute("hobby", hobby);
    session.setAttribute("livingType", livingType);
    session.setAttribute("somethingToSay", somethingToSay);

    return "show.jsp"
;  }


}

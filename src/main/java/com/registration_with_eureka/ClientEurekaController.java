package com.registration_with_eureka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientEurekaController {

  @RequestMapping(value = "/")
  public @ResponseBody String home() {
    System.out.println("Eureka Client Application");
    return "Eureka Client Application";
  }

}

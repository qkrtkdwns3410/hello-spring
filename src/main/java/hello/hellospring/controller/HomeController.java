package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * packageName    : hello.hellospring.controller
 * fileName       : HomeController
 * author         : ipeac
 * date           : 2022-06-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-15        ipeac       최초 생성
 */
@Controller
public class HomeController {
      
      @GetMapping("/")
      public String home() {
            return "home";
      }
      
}



package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * packageName    : hello.hellospring.controller
 * fileName       : MemberController
 * author         : ipeac
 * date           : 2022-06-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-15        ipeac       최초 생성
 */

@Controller
public class MemberController {
      
      private final MemberService memberService;
      
      @Autowired // - > 스프링 컨테이너에 memberService 를 연결시켜줍니다.
      public MemberController(MemberService memberService) {
            this.memberService = memberService;
      }
      
}

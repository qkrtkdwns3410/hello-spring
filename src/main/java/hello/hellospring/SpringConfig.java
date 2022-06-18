package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * packageName    : hello.hellospring
 * fileName       : SpringConfig
 * author         : ipeac
 * date           : 2022-06-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-15        ipeac       최초 생성
 */
@Configuration
public class SpringConfig {
      
      private final MemberRepository memberRepository;
      
      public SpringConfig(MemberRepository memberRepository) {
            this.memberRepository = memberRepository;
      }
      
      @Bean
      public MemberService memberService() {
            return new MemberService(memberRepository);
      }
      
      //      @Bean
      //      public MemberRepository memberRepository() {
      //            return new MemoryMemberRepository();
      //            return new JpaMemberRepository(em);
      //            return null;
      //}
}
      


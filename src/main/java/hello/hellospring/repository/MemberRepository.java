package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;


/**
 * packageName    : hello.hellospring.repository
 * fileName       : MemberRepository
 * author         : ipeac
 * date           : 2022-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-13        ipeac       최초 생성
 */

public interface MemberRepository {
      
      Member save(Member member);
      
      Optional<Member> findById(Long id);
      
      Optional<Member> findByName(String name);
      
      List<Member> findAll();
      
      
}

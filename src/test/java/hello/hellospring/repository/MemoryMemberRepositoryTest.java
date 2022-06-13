package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.list;


/**
 * packageName    : hello.hellospring.repository
 * fileName       : MemoryMemberRepositoryTest
 * author         : ipeac
 * date           : 2022-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-13        ipeac       최초 생성
 */

public class MemoryMemberRepositoryTest {
      
      MemoryMemberRepository repository = new MemoryMemberRepository();
      
      @AfterEach
      public void afterEach() {
            repository.clearStore();
      }
      
      @Test
      public void save() {
            Member member = new Member();
            member.setName("spring");
            
            repository.save(member);
            
            Member result = repository.findById(member.getId())
                                      .get();
            
            assertThat(member).isEqualTo(result);
      }
      
      @Test
      public void findByName() {
            Member member1 = new Member();
            member1.setName("spring1");
            repository.save(member1);
            
            Member member2 = new Member();
            member2.setName("spring2");
            repository.save(member2);
            
            Member result1 = repository.findByName("spring1")
                                       .get();
            assertThat(result1).isEqualTo(member1);
      }
      
      @Test
      void findAll() {
            Member member1 = new Member();
            member1.setName("spring1");
            repository.save(member1);
            
            Member member2 = new Member();
            member2.setName("spring2");
            repository.save(member2);
            
            List<Member> result = repository.findAll();
            
            assertThat(result.size()).isEqualTo(2);
      }
      
}
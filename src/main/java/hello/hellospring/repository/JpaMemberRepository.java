package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;


/**
 * packageName    : hello.hellospring.repository
 * fileName       : JpaMemberRepository
 * author         : ipeac
 * date           : 2022-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-16        ipeac       최초 생성
 */

public class JpaMemberRepository implements MemberRepository {
      
      private final EntityManager em;
      
      public JpaMemberRepository(EntityManager em) {
            this.em = em;
      }
      
      @Override
      public Member save(Member member) {
            em.persist(member);
            
            return member;
      }
      
      @Override
      public Optional<Member> findById(Long id) {
            Member member = em.find(Member.class, id);
            
            return Optional.ofNullable(member);
      }
      
      @Override
      public Optional<Member> findByName(String name) {
            List<Member> resultList = em.createQuery("select  m from Member  m where  m.name = :name", Member.class)
                                        .getResultList();
            return resultList.stream()
                             .findAny();
      }
      
      @Override
      public List<Member> findAll() {
            List<Member> memberList = em.createQuery("select m from Member m", Member.class)
                                        .getResultList();
            return memberList;
      }
      
}

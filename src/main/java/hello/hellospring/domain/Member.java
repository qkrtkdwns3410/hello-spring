package hello.hellospring.domain;

import javax.persistence.*;


/**
 * packageName    : hello.hellospring.domain
 * fileName       : Member
 * author         : ipeac
 * date           : 2022-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-13        ipeac       최초 생성
 */
@Entity
public class Member {
      
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      
      private String name;
      
      public Long getId() {
            return id;
      }
      
      public void setId(Long id) {
            this.id = id;
      }
      
      public String getName() {
            return name;
      }
      
      public void setName(String name) {
            this.name = name;
      }
      
}

package sjz.clkj.ssh.demo.repository.spring.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import sjz.clkj.ssh.demo.Entity.spring.data.jpa.Homework;
/**
 * 
 * @version: 1.1.0
 * @Description: springDataJPA持久层
 * @author: wsq
 * @date: 2020年5月31日下午3:18:55
 */
public interface HomeWorkRepository extends JpaRepository<Homework,Integer>{

}

package sjz.clkj.ssh.demo.Entity.spring.data.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
/**
 * 
 * @version: 1.1.0
 * @Description: user实体类
 * @author: wsq
 * @date: 2020年5月31日下午3:18:55
 */
@Data
@Entity
@Table(name = "user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "user_id")
private int userId;
@Column(name = "name")
private String name;
@Column(name = "age")
private int age;
@Column(name = "sex")
private String sex;
}

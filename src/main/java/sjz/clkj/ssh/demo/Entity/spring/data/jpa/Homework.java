package sjz.clkj.ssh.demo.Entity.spring.data.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * 
 * @version: 1.1.0
 * @Description: 实体类
 * @author: wsq
 * @date: 2020年5月31日下午5:02:06
 */
@Data
@Entity
@Table(name = "homework")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class Homework {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "homework_id")
private int homeworkId;

@Column(name = "name")
private String name;
/**
 * 单项一对一 如果为双向一对一，在另一端加上@OneToOne(mappedBy = "homework")，还可以通过关联表进行关联
 */
@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
@JoinColumn(name="user_id",referencedColumnName="user_id",nullable=false)
private User user;
}

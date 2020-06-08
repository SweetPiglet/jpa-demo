package sjz.clkj.ssh.demo.service.spring.data.jpa;
/**
 * 
 * @version: 1.1.0
 * @Description: springDataJPA业务层
 * @author: wsq
 * @date: 2020年5月31日下午3:18:55
 */

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sjz.clkj.ssh.demo.Entity.spring.data.jpa.User;
import sjz.clkj.ssh.demo.repository.spring.data.jpa.UserRepository;
@Service
public class UserService {
@Resource
private UserRepository userRepository;
/**
 * 
 * @version: 1.1.0
 * @Description: 添加用户
 * @author: wsq
 * @date: 2020年5月31日下午3:18:55
 */
public void addUser(User user) {
	userRepository.save(user);
}
/**
 * 
 * @version: 1.1.0
 * @Description: 添加用户
 * @author: wsq
 * @date: 2020年5月31日下午3:18:55
 */
public List<User> findUserList() {
	return (List<User>) userRepository.findAll();
}
}

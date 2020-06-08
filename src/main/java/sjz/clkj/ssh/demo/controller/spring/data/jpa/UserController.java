package sjz.clkj.ssh.demo.controller.spring.data.jpa;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sjz.clkj.ssh.demo.Entity.spring.data.jpa.User;
import sjz.clkj.ssh.demo.model.R;
import sjz.clkj.ssh.demo.service.spring.data.jpa.UserService;
/**
 * 
 * @version: 1.1.0
 * @Description: springDataJPA控制层
 * @author: wsq
 * @date: 2020年5月31日下午3:18:55
 */
@RestController
public class UserController {
@Resource
private UserService userService;
/**
 * 
 * @version: 1.1.0
 * @Description: springDataJPA控制层
 * @author: wsq
 * @date: 2020年5月31日下午3:18:55
 */
@PostMapping("/user/addUser")
public void addUser(@RequestBody User user) {
	userService.addUser(user);
}
@PostMapping("/user/findUserList")
public R findUserlist() {
	return R.ok().put("userList", userService.findUserList());
}
}

package sjz.clkj.ssh.demo.controller.spring.data.jpa;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sjz.clkj.ssh.demo.model.R;
import sjz.clkj.ssh.demo.service.spring.data.jpa.HomeworkService;
/**
 * 
 * @version: 1.1.0
 * @Description: 作业控制层
 * @author: wsq
 * @date: 2020年5月31日下午7:17:46
 */
@RestController
public class HomewordController {
@Resource
private HomeworkService homeworkService;
@GetMapping("/homework/findHomeworkById")
public R findHomeworkById(@RequestParam("homeworkId")int homeworkId) {
	return R.ok().put("homework", homeworkService.findHomeWorkById(homeworkId));
}
}

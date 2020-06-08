package sjz.clkj.ssh.demo.service.spring.data.jpa;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sjz.clkj.ssh.demo.Entity.spring.data.jpa.Homework;
import sjz.clkj.ssh.demo.repository.spring.data.jpa.HomeWorkRepository;
/**
 * 
 * @version: 1.1.0
 * @Description: 作业的业务层
 * @author: wsq
 * @date: 2020年5月31日下午7:09:54
 */
@Service
public class HomeworkService {
@Resource
private HomeWorkRepository homeWorkRepository;
public Homework findHomeWorkById(int HomeworkId) {
	System.err.println(HomeworkId);
	return homeWorkRepository.findById(HomeworkId).get();
}
}

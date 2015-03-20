package cn.com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.test.dao.TestDao;
import cn.com.test.model.TestModel;

@Service
public class TestServiceImpl implements ITestService {
	@Autowired
	private TestDao testDao;

	public TestModel findOne(int id) {
		return testDao.selectTestModel(id);
	}

}

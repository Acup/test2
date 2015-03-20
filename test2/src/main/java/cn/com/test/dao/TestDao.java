package cn.com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.test.model.TestModel;

public interface TestDao {
	public TestModel selectTestModel(int id);

	public void insertBlog(TestModel blog);

	public void updateBlog(TestModel blog);

	public void deleteBlog(int id);

	public List<TestModel> findAll();
}

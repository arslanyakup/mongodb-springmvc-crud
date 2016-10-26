package com.arslanyakup.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import com.arslanyakup.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private MongoTemplate mongoTemplate;

	@Autowired
	public EmployeeRepositoryImpl(MongoTemplate mongoTemplate) {
		super();
		this.setMongoTemplate(mongoTemplate);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> empList = mongoTemplate.findAll(Employee.class);
		return empList;

	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0, Sort arg1) {
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0) {
		return null;
	}

	@Override
	public List<Employee> findAll(Sort arg0) {
		return null;
	}

	@Override
	public <S extends Employee> List<S> insert(Iterable<S> arg0) {
		return null;
	}

	@Override
	public <S extends Employee> S insert(S arg0) {
		return null;
	}

	@Override
	public <S extends Employee> List<S> save(Iterable<S> arg0) {
		return null;
	}

	@Override
	public <S extends Employee> S findOne(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Employee> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> example) {
		return false;
	}

	@Override
	public Page<Employee> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Employee> S save(S entity) {
		return null;
	}

	@Override
	public Employee findOne(String id) {
		return null;
	}

	@Override
	public boolean exists(String id) {
		return false;
	}

	@Override
	public Iterable<Employee> findAll(Iterable<String> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(String id) {
		Criteria criteria=where("_id").is(id);
		mongoTemplate.remove(Query.query(criteria), EmployeeRepository.class);
	}

	@Override
	public void delete(Employee entity) {
		mongoTemplate.remove(entity);
	}

	@Override
	public void delete(Iterable<? extends Employee> entities) {

	}

	@Override
	public void deleteAll() {

	}

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}


}

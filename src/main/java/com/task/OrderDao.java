package com.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository or;

	public String saveAll(List<OrderEntity> o) {
		or.saveAll(o);
		return "saved";
	}

	public List<Object[]> get(int id) {
		return or.get(id);
	}

}

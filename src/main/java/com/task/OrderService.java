package com.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
	@Autowired
	OrderDao od;

	public String saveAll(List<OrderEntity> o) {
		return od.saveAll(o);
	}

	public List<Object[]> get(int id) {
		return od.get(id);
	}
	
}

package com.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService os;
	@PostMapping("/saveAllValue")
	public String saveAll(@RequestBody List<OrderEntity> o) {
		return os.saveAll(o);
	}
	@GetMapping("get/{id}")
	List<Object[]> getPincodeAndProductName(@PathVariable int id) {
		return os.get(id);
	}
}

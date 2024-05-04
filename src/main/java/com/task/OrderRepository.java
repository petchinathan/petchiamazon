package com.task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer>{
	@Query(value="select o.pincode,p.prod_name from neworder o Inner Join product_table p On o.id = p.order_fkey where o.id = :id",nativeQuery = true)
	List<Object[]> get(int id);

}

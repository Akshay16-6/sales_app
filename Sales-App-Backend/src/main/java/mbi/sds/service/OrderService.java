package mbi.sds.service;

import java.util.List;

import mbi.sds.entity.Order;

public interface OrderService {
	List<Order> getAllOrders();

	Order getOrderById(Long id);

	Order saveOrder(Order order);

	void deleteOrder(Long id);
}

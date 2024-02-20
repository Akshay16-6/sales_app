package mbi.sds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mbi.sds.entity.Order;
import mbi.sds.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	@GetMapping("/getOrderById/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return orderService.getOrderById(id);
	}

	@PostMapping("/createOrder")
	public Order createOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}

	@PutMapping("/updateOrder/{id}")
	public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
		order.setId(id);
		return orderService.saveOrder(order);
	}

	@DeleteMapping("/deleteOrder/{id}")
	public void deleteOrder(@PathVariable Long id) {
		orderService.deleteOrder(id);
	}

}

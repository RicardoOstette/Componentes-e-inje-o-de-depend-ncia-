package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;

public class OrderService {
	
	private ShippingService shippingService;

	public Double total(Order order) {
		return order.getBasic() 
			   - (order.getBasic() * order.getDiscount() / 100) 
			   + shippingService.shipment(order) ;
	}
}

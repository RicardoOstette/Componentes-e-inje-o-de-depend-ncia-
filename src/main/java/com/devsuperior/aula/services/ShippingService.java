package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		if (order.getBasic() < 100.00) {
			return 20.00;
		}
		else if (order.getBasic() < 200.00) {
			return 12.00;
		}
		else {
			return 00.00;
		}
	}
}

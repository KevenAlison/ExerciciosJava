package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order(1080, new  Date(), OrderStatus.PENDING__PAYMENT);
		
		
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DElIVERED;
		
		OrderStatus os2 = OrderStatus.value("DElIVERED"z);
	}
	

}

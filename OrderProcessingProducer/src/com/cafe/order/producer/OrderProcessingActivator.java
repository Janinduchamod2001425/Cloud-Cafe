package com.cafe.order.producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class OrderProcessingActivator implements BundleActivator {

	private ServiceRegistration<?> registration;
	
	public void start(BundleContext context) throws Exception {
		// Register the OrderProcessingService
		registration = context.registerService(OrderProcessingService.class.getName(), new OrderProcessingServiceImpl(), null);
		System.out.println("💵 Cloud Cafe Opened");
		
	}

	public void stop(BundleContext context) throws Exception {
		registration.unregister();
		System.out.println("☕ Cloud Cafe Closed");
		System.out.println("🙋🏻‍♂️ See You Again... 👋");
	}

}

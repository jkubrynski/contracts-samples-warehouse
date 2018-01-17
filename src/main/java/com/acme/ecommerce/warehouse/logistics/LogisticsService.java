package com.acme.ecommerce.warehouse.logistics;

import java.util.HashMap;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class LogisticsService {

	private final LogisticsQueue logisticsQueue;

	public LogisticsService(LogisticsQueue logisticsQueue) {
		this.logisticsQueue = logisticsQueue;
	}

	public void dispatchPackageSentMessage(String packageId) {
		HashMap<String, Object> headers = new HashMap<>();
		headers.put("contentType", "application/json");
		MessageHeaders messageHeaders = new MessageHeaders(headers);
		logisticsQueue.logisticsQueueChannel().send(MessageBuilder.createMessage(
				new PackageMessage(LogisticsEventType.PACKAGE_SENT, packageId), messageHeaders));
	}
}

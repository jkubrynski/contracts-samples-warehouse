package com.acme.ecommerce.warehouse.logistics;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface LogisticsQueue {

	@Output("logisticsQueue")
	MessageChannel logisticsQueueChannel();

}

package com.acme.ecommerce.warehouse.logistics;

class PackageMessage {

	private final LogisticsEventType eventType;
	private final String objectId;

	PackageMessage(LogisticsEventType eventType, String objectId) {
		this.eventType = eventType;
		this.objectId = objectId;
	}

	@SuppressWarnings("unused")
	public LogisticsEventType getEventType() {
		return eventType;
	}

	@SuppressWarnings("unused")
	public String getObjectId() {
		return objectId;
	}
}

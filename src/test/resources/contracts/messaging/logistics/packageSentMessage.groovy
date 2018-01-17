package contracts.messaging.logistics

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	label 'packageSentMessage'
	input {
		triggeredBy('triggerPackageSentMessage()')
	}
	outputMessage {
		sentTo('logisticsQueue')
		body('{ "eventType": "PACKAGE_SENT", "objectId": "7JS8HD8" }')
		headers {
			messagingContentType(applicationJson())
		}
	}
}
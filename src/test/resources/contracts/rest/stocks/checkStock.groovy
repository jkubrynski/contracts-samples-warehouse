package contracts.rest.stocks

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'GET'
		url '/stocks/34257815'
		headers {
			accept(applicationJson())
		}
	}
	response {
		status 200
		headers {
			contentType(applicationJson())
		}
		body(
				'id': '34257815',
				'available': true
		)
	}
}
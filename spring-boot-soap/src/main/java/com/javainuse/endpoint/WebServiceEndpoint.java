package com.javainuse.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javainuse.models.NotificationContainer;

@Endpoint
public class WebServiceEndpoint {

	//e o nameUrl do schema
	private static final String NAMESPACE_URI = "http://www.aglaia-gmbh.de/xml/2013/05/17/BaSS_SOAPd.xsd";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart ="notification_message")
	@ResponsePayload
	public void hello(@RequestPayload NotificationContainer request) {

		String outputString = "Hello ";

		/*ObjectFactory factory = new ObjectFactory();
		OutputSOATest response = factory.createOutputSOATest();
		response.setResult(outputString);

		return response;*/
	}
	
	

	
}

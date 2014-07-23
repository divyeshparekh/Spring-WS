package org.mycompany.simple_ws;

import org.springframework.ws.server.endpoint.AbstractDomPayloadEndpoint;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SimpleEndPoint extends AbstractDomPayloadEndpoint {
	
	public SimpleEndPoint() {
		
		System.out.println("Instantiated .............. ");
		}
	
	protected Element invokeInternal(Element simpleRequest, Document document) throws Exception {
		
		System.out.println("Testing End Point.......................");
		
		String fn =simpleRequest.getElementsByTagName("firstname").item(0).getTextContent();
		String sn =simpleRequest.getElementsByTagName("surname").item(0).getTextContent();
		
		String requestText = "firstname=" + fn + " " + "surname=" + sn;
		
		System.out.println("request is for: " + requestText);
		
		Element responseElement = document.createElement("simpleResponse");
		responseElement.setTextContent(fn + " " + sn);
		
		return responseElement;
	}
}

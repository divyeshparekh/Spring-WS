package org.mycompany.simple_ws;

import java.io.StringReader;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.springframework.ws.client.core.WebServiceTemplate;

public class Client {

	private static final String MSG = "<simpleRequest><firstname>Divyesh</firstname><surname>Parekh</surname></simpleRequest>";
	private static final String URL = "http://localhost:9020/simple-ws/simpleService/";

	public static void main(String[] args) {
		WebServiceTemplate template = new WebServiceTemplate();
		StreamSource source = new StreamSource(new StringReader(MSG));
		StreamResult result = new StreamResult(System.out);
		template.sendSourceAndReceiveToResult(URL, source, result);
	}
}

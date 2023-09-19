package collection;

import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String xmlStr = 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n" + 
				"<person>\r\n" + 
				"<name>홍길동</name>\r\n" + 
				"<age>20</age>\r\n" + 
				"</person>";
		
		// xml -> json
		int indent = 4;
		JSONObject jo = XML.toJSONObject(xmlStr);
		String jsonStr = jo.toString(indent);
		
		System.out.println(jsonStr);
		System.out.println("================y============\n");
		
		
		// json -> map
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> map;
		map = om.readValue(jsonStr, new TypeReference<Map <String, Object> > () {});
		
		System.out.println(map);
		System.out.println(map.get("person"));
		System.out.println(((Map)map.get("person")).get("name"));
		System.out.println(((Map)map.get("person")).get("age"));
	}
}

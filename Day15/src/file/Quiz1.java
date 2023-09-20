package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quiz1 {
	public static void main(String[] args) throws Exception {
		
	    BufferedReader br = new BufferedReader(new FileReader("person.xml"));

        String xmlStr = "";
        String line;

        while ((line = br.readLine()) != null) {
            xmlStr += line + "\n";
        }
        System.out.println("XML 데이터 출력>> ");
        System.out.println(xmlStr);

        // xml -> json
        int indent = 4;
        JSONObject jo = XML.toJSONObject(xmlStr);
        String jsonStr = jo.toString(indent);

        System.out.println("\nJSON 데이터 출력>> ");
        System.out.println(jsonStr);

        // json -> map
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map;
        map = om.readValue(jsonStr, new TypeReference<Map<String, Object>>() {});

        System.out.println("\nMap으로 변환된 데이터 출력>> ");
        System.out.println(map);
        System.out.println(map.get("person"));
    	System.out.println(((Map)map.get("person")).get("name"));
		System.out.println(((Map)map.get("person")).get("age"));
        br.close();
	}
}

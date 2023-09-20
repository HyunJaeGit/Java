package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quiz {
	public static void main(String[] args) throws Exception {
		// 1. 현재 프로젝트에 있는 person.json을 읽어온다
		// 2. 그대로 콘솔에 출력해 본다
		// 3. Map으로 변환 시켜 출력한다 (※ 라이브러리 추가 까먹지 말고~)
		
		// 1번 (BufferedReader)
		BufferedReader br = new BufferedReader(new FileReader("person.json"));
		
		// 2번 (readLine)
		String json = "";
		String line;
		
		while ((line = br.readLine()) != null) {
			json += line + "\n";
		}
		System.out.println(json);
		
		// 3번 (ObjectMapper, readValue, TypeReference)
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> map;
		map = om.readValue(json, new TypeReference<Map<String, Object>>() {});
		
		
		System.out.println(map);
		System.out.println(map.get("person"));
		System.out.println(((Map)map.get("person")).get("name"));
		br.close();
	}
	
}

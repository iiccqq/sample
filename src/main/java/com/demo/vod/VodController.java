package com.demo.vod;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VodController {
	
	
	@RequestMapping("/")
	Map<String,String> getContents(){
		Map<String,String> map = new HashMap();
		map.put("status", "0");
		map.put("desc", "操作成功");
		return map;
		
	}

}

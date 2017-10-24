package com.icode.framework.test.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class JsonTest {
	public static void main(String[] args) {
		ListEntity listEntity = new ListEntity();
		ListItemEntity item1 = new ListItemEntity();
		ListItemEntity item2 = new ListItemEntity();
		List<ListItemEntity> entities = new ArrayList<>();
		listEntity.setEntities(entities );
		entities.add(item1);
		entities.add(item2);
		item1.setId("item1");
		item1.setUsername("xbz");
		item2.setId("item2");
		item2.setUsername("zbx");
		System.out.println(JSON.toJSONString(listEntity));
		
	}
}

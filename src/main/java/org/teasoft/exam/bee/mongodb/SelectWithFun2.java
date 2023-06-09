/*
 * Copyright 2016-2022 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.exam.bee.mongodb;

import org.teasoft.bee.osql.FunctionType;
import org.teasoft.bee.osql.api.SuidRich;
import org.teasoft.exam.bee.mongodb.entity.Noid0;
import org.teasoft.honey.osql.shortcut.BF;

/**
 * @author AiTeaSoft
 * @since  2.0
 */
public class SelectWithFun2 {
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		
		SuidRich suidRich =BF.getSuidRich();
		
		Noid0 noid0=new Noid0();
//		noid0.setName("mongodb99");
		noid0.setName("2121aa");  //测null值

		String max = suidRich.selectWithFun(noid0, FunctionType.MAX, "num", null); // 不是mongodb的string id格式.
		System.out.println("max: "+max);
		
		String min = suidRich.selectWithFun(noid0, FunctionType.MIN, "num", null); 
		System.out.println("min: "+min);
		
		String avg = suidRich.selectWithFun(noid0, FunctionType.AVG, "num", null); 
		System.out.println("avg: "+avg);
		
		String sum = suidRich.selectWithFun(noid0, FunctionType.SUM, "num", null); 
		System.out.println("sum: "+sum);
		
		String count = suidRich.selectWithFun(noid0, FunctionType.COUNT, "num", null); 
		System.out.println("count: "+count);

//		List<Noid0> list = suidRich.selectByIds(new Noid0(),
//				"63862e06bdcb6d0dac9c02c7,6386323f3f581a223ab8a10e,ewewewewew");
//		Printer.printList(list);
//		List<Noid0> list2 = suidRich.select(new Noid0());
//		Printer.printList(list2);
		
		System.out.println("finished!");
	}
}

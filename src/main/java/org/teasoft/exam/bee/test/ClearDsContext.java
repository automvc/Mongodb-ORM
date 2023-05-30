/*
 * Copyright 2016-2023 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.exam.bee.test;

import org.teasoft.beex.mongodb.ds.MongoContext;
import org.teasoft.honey.osql.core.BeeFactory;
import org.teasoft.honey.osql.core.HoneyConfig;
import org.teasoft.honey.osql.core.HoneyContext;

/**
 * @author Kingstar
 * @since  2.1
 */
public class ClearDsContext {

	// 只是在测试同时用多数DB时,会用到. 在setUrl清空,不好,会把原有的ds清空,那实际是要的.
	public static void clear() {
		try {
			HoneyConfig honeyConfig = HoneyConfig.getHoneyConfig();
			honeyConfig.multiDS_enable = false;
			honeyConfig.multiDS_sharding = false;
			honeyConfig.multiDS_type = 0;
			honeyConfig.multiDS_differentDbType = false;
			honeyConfig.multiDS_defalutDS=null;
			
			BeeFactory beeFactory = BeeFactory.getInstance();
			beeFactory.setDataSource(null);
			beeFactory.setDataSourceMap(null);
			beeFactory.setTransaction(null);

			HoneyContext.removeCurrentConnection();
			MongoContext.removeClientSession();
			MongoContext.removeMongoClient();
			
			HoneyContext.setConfigRefresh(true); //涉及路由信息更新要刷新

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

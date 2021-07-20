package com.atguigu.recommender


/**
  * Rating数据集
  * 4867        用户ID
  * 457976      商品ID
  * 5.0         评分
  * 1395676800  时间戳
  */
case class Rating( userId: Int, productId: Int, score: Double, timestamp: Int )
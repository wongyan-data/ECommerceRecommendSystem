package com.atguigu.recommender


/**
  * MongoDB连接配置
  * @param uri    MongoDB的连接uri
  * @param db     要操作的db
  */
case class MongoConfig( uri: String, db: String )
package com.atguigu.recommender

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object test {


  def storeDataInMongoDB() ={
      print("112")
  }
  // 定义数据文件路径
  val PRODUCT_DATA_PATH = "G:\\Java\\大数据\\电商推荐系统\\systemCode\\systemCode\\ECommerceRecommendSystem\\ECommerceRecommendSystem\\recommender\\DataLoader\\src\\main\\resources\\products.csv"
  val RATING_DATA_PATH = "G:\\Java\\大数据\\电商推荐系统\\systemCode\\systemCode\\ECommerceRecommendSystem\\ECommerceRecommendSystem\\recommender\\DataLoader\\src\\main\\resources\\ratings.csv"
  // 定义mongodb中存储的表名
  val MONGODB_PRODUCT_COLLECTION = "Product"
  val MONGODB_RATING_COLLECTION = "Rating"
  def main(args: Array[String]): Unit = {
    val config = Map(
      "spark.cores" -> "local[*]",
      "mongo.uri" -> "mongodb://hadoop102:27017/recommender",
      "mongo.db" -> "recommender"
    )
      // 创建一个spark config
      val sparkConf = new SparkConf().setMaster(config("spark.cores")).setAppName("DataLoader")
      // 创建spark session
      val spark = SparkSession.builder().config(sparkConf).getOrCreate()




      val ratingRDD = null
      val ratingDF = null
  

      implicit val mongoConfig = null

      storeDataInMongoDB( )

    }

     


 
}


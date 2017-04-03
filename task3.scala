
val lines = sc.textFile("data_input")

val leftSide = lines.map(_.split("\t")(0)).map(word=>(word,1)).reduceByKey(_ + _)
val collected = leftSide.collect
val maxKey = collected.maxBy(_._2)

val maxOut = maxKey._2

val maxList = collected.filter(_._2 == maxOut)
val result = sc.parallelize(maxList).map(_._1)
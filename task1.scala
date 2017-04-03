

val lines = sc.textFile("data_input")
val rightSide = lines.map(_.split("\t")(1)).map(word=>(word,1)).reduceByKey(_ + _)
val collected = rightSide.collect
val maxKey = collected.maxBy(_._2)

var result = maxKey._2



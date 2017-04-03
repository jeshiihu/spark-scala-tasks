

val lines = sc.textFile("data_input")
val rightSide = lines.flatMap(line => line.split("\t")).map(word=>(word,1)).reduceByKey(_ + _)
val collected = rightSide.collect
val maxKey = collected.maxBy(_._2)

var result = maxKey._2





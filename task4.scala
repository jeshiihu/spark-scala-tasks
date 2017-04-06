
// http://stackoverflow.com/questions/36168588/spark-find-key-value-pairs-with-key-equals-to-other-values-and-join

val lines = sc.textFile("data_input")
val leftSideSplit = lines.map(_.split("\t")).map(w => (w(0), w(1))).collect
val leftSet = leftSideSplit.toSet

val keysEquallingValues = leftSet.flatMap { tuple => 
  leftSet.find(t => tuple._2 == t._1).map(t => tuple -> t)
}
val r = leftSet ++ keysEquallingValues.map(pair => pair._1._1 -> pair._2._2)
val result = sc.parallelize(r.toList).groupByKey()





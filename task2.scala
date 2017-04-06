

val lines = sc.textFile("data_input")
val leftSidesplit = lines.map(_.split("\t")).map(w => (w(0), w(1)));
val rightSidesplit = lines.map(_.split("\t")).map(w => (w(1), w(0)));

val uni = leftSidesplit union rightSidesplit
val result = uni.groupByKey().map(w => (w._1,w._2.toList.distinct))


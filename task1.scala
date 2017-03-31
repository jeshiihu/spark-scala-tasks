
val dataInput = sc.textFile("data_input")
val lCount = dataInput.count()
val iCount = lCount.toInt

// obtaining an array[int] from the data
val arrInput = dataInput.take(iCount)
val splitInput = arrInput.map(_.split("\t"))
val intInput = splitInput.map(_.map(_.toInt))

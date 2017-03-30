
val dataInput = sc.textFile("data_input")
val lCount = dataInput.count()
val iCount = lCount.toInt

val arrInput = dataInput.take(iCount)

val line = arrInput(0);
val split = line.split("\t")
val why = split(0).toInt
val idk = split(1).toInt

for( x <- arrInput ){
   val split = x.split(" ")
}
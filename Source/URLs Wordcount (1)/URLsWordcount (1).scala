import org.apache.spark.sql.SparkSession

object wordcounturl {
  def main(args: Array[String]) {

    System.setProperty("hadoop.home.dir", "C:\\Winutils");

    val sc = SparkSession
      .builder
      .appName("SparkWordCount")
      .master("local[*]")
      .getOrCreate().sparkContext

    val inputfile="D:\\Downloads\\extracturls.txt"
    val input=sc.textFile(inputfile)

    val words=input.flatMap(line=>line.split(" "))
    val counts=words.map(word=>(word,1)).reduceByKey{case (x,y)=>x+y}
    val outputfile="D:\\Downloads\\outputFile1"
    counts.saveAsTextFile(outputfile)


  }
}

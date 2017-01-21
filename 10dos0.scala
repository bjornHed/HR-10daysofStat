object Solution {

    def main(args: Array[String]) {
        val n = scala.io.StdIn.readLine();
        val s_1 = scala.io.StdIn.readLine();
        val st_1 = s_1.split(" ");
        val above = st_1.map(x => x.toInt);
        val s_2 = scala.io.StdIn.readLine();
        val st_2 = s_2.split(" ");
        val below = st_2.map(x => x.toInt);

        val av = (above.zip(below).map { case (x, y) => x * y }).sum
        val bv = below.sum
        //BigDecimal is use to get only one decimals precision.
        println(BigDecimal(av.toFloat/bv).setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble)
    }
}

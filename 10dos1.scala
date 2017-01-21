// Calculates the standard deviation First input is number N of
// following numbers to calculate with. The second input is a space
// separated string containing N numbers. The output is the standard
//deviation between these numbers.

object Solution {

    def main(args: Array[String]) {
        val n = scala.io.StdIn.readLine();
        val s = scala.io.StdIn.readLine();
        val st = s.split(" ");
        val above = st.map(x => x.toInt);
        val mean = (above.sum.toFloat)/n.toInt;
        val n_above = above.map(x => scala.math.pow((x-mean),2) );
        //BigDecimal is used to get only one decimals precision.
        println(BigDecimal( scala.math.sqrt(n_above.sum/n.toInt) )
          .setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble)
    }
}

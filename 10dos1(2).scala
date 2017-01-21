//calculates the quartiles of a given input. First line is number N of
//expected inputs, the second line is N space-separated numbers.
object Solution {

    def main(args: Array[String]) {
        val n_t = scala.io.StdIn.readLine();
        val n = n_t.toInt;
        val s = scala.io.StdIn.readLine();
        val st = s.split(" ");
        val a_temp = st.map(x => x.toInt);
        val a = a_temp.sorted;
        //Placeholder array
        var snd = Array(1,2);

        if (n % 2 == 0) {
            snd = (a.splitAt(n/2)._2);
        } else {
            snd = (a.splitAt(n/2)._2).tail;
        }
            val f = a.splitAt(n/2)._1;
            quartiles(f,snd,median(a));
    }

    def quartiles( low: Array[Int], high: Array[Int], medi: Float) {
      println(BigDecimal( median(low))
        .setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble);
      println(medi);
      println(BigDecimal( median(high))
        .setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble)
    }

    def median (lst: Array[Int]) : Float = {
        val length = lst.size;
        if (length % 2 == 0) {
          return ((lst(length/2)+lst(length/2 - 1)).toFloat/2);
        }
        return lst(length/2);
    }

}

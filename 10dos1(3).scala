//calculates the quartiles of a given input. First line is number N of
//expected inputs, the second line is N space-separated numbers.
object Solution {

    def main(args: Array[String]) {
        val n_t = scala.io.StdIn.readLine();
        val n = n_t.toInt;
        val s = scala.io.StdIn.readLine();
        val st = s.split(" ");
        val a = st.map(x => x.toInt);

        val s2 = scala.io.StdIn.readLine();
        val st2 = s2.split(" ");
        val b = st2.map(x => x.toInt);

        val c = ((a.zip(b).map { case (x,y) => Array.fill(y)(x) })
            .fold(Array()){ (i,j) => i ++ j }).sorted

        //Placeholder array
        var snd = Array(1,2);

        if (c.size % 2 == 0) {
            snd = (c.splitAt((c.size)/2)._2);
        } else {
            snd = (c.splitAt((c.size)/2)._2).tail;
        }
            val f = c.splitAt((c.size)/2)._1;
            quartiles(f,snd,median(c));
    }

    def quartiles( low: Array[Int], high: Array[Int], medi: Float) {
        val q3 = median(high);
        val q1 = median(low);
        println(BigDecimal( q3-q1)
            .setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble);
    }

    def median (lst: Array[Int]) : Float = {
        val length = lst.size;
        if (length % 2 == 0) {
          return ((lst(length/2)+lst(length/2 - 1)).toFloat/2);
        }
        return lst(length/2);
    }

}

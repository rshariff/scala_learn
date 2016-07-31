package coursera_1

/**
  * Created by rshariff on 7/31/16.
  */
object Factorial {
  def factorial (n: Int): Int ={
    def factorialLoop (n: Int, total: Int): Int = {
      if (n == 0) total else factorialLoop(n -1, total * n)
    }
    factorialLoop(n, 1);
  }



}

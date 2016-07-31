package coursera_1.newton

/**
  * Created by rshariff on 7/31/16.
  */
object NewtonMethod {
  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x)/ x < .001

    def improve(guess: Double): Double =
      (x/guess + guess) / 2

    sqrtIter(1)
  }


  def abs(d: Double): Double =
    if (d > 0) d else -d
}

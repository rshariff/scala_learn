package coursera_1.operator

/**
  * Sum2 takes two Integers and treats them as one which is the total of the two
  */
class Sum2(a: Int, b: Int) {

  def less(that: Sum2):Boolean = {
    getValue < that.getValue
  }

  // but you can use operator to do the same thing
  def < (that: Sum2): Boolean = {
    less(that)
  }

  def add(that: Sum2): Int = {
    getValue + that.getValue
  }

  // but you can use operator to do the same thing
  def + (that: Sum2) : Int = {
    add(that)
  }

  def sub(that: Sum2): Int = {
    getValue - that.getValue
  }

  def - (that:Sum2): Int = {
    sub(that)
  }

  def neg: Int = {
    -getValue
  }

  def unary_- :Int = {
    neg
  }

  private def getValue: Int = { a + b }

}

package coursera_1.abstract_class

/**
  * Created by rshariff on 8/21/16.
  */
abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}

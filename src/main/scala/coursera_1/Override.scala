package coursera_1

/**
  * Created by rshariff on 8/21/16.
  */
object Override {
  abstract class Base{
    def foo = 1
    def bar
  }
  class Sub extends Base {
    override def foo = 3
    def bar = 5
  }
}

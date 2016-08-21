package option

/**
  * Created by richardshariff on 8/16/16.
  */
object OptionTests {
  def printForeach(optionString :Option[String]): Unit ={
    optionString.foreach((s) => print("this is a " + s))
  }

  def mapIt(optionString :Option[String]): Option[String] = {
    return optionString.map((s) => s + " is bigger")
  }

  def flatMapIt(optionString: Option[Option[String]]): Option[String] = {
    return optionString.flatMap((s) => Some(s + "is flat"))
  }
}

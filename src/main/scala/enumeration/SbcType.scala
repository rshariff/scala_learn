package enumeration

/**
  * Created by richardshariff on 8/20/16.
  */
object SbcType extends Enumeration {
  sealed case class SbcTypeValue(name: String, pdbActionCodeOff: Int, pdbActionCodeOn: Int) extends Val(name);

  val ADLEFT   = SbcTypeValue("adl", 5, 6)
  val ADRIGHT  = SbcTypeValue("adr", 7, 8)
  val MAINTIANCE = SbcTypeValue("maint", 0, 0)

  def getSbcTypeValue(name: String): SbcTypeValue = {
    super.withName(name).asInstanceOf[SbcTypeValue]
  }
}

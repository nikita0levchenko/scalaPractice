class FirstScalaClass {


}

object FirstScalaClass {
  def helloName(name: String ) = "Hello " + Option(name).get
  def helloNameWithStringInterpolation(name: String) =  {
    val sName = Option(name).get
    s"Hello${name}"
  }

}
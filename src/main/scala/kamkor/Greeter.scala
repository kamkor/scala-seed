package kamkor

class Greeter(val greetMsg: String) {

  def greet(to: String): String = s"$greetMsg $to"

}

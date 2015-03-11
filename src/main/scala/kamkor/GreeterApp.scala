package kamkor

import org.slf4j.LoggerFactory

object GreeterApp {

  val Logger = LoggerFactory.getLogger(GreeterApp.getClass())

  def main(args: Array[String]): Unit = {
    val greeter = new Greeter("Hello")
    Logger.info(greeter.greet("World"))
    Logger.info(greeter.greet("My Friend"))
  }

}

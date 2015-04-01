package kamkor

import com.typesafe.scalalogging.LazyLogging

object GreeterApp extends LazyLogging {

  def main(args: Array[String]): Unit = {
    val greeter = new Greeter("Hello")
    logger.info(greeter.greet("World"))
    logger.info(greeter.greet("My Friend"))
  }

}

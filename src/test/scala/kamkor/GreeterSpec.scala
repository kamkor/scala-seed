package kamkor

import org.scalatest.prop.GeneratorDrivenPropertyChecks

class GreeterSpec extends UnitSpec with GeneratorDrivenPropertyChecks {
  
  "A Greeter" should {
    "greet with greet message" in {      
      forAll { (greetMsg: String, to: String) =>
        val greeter = new Greeter(greetMsg)        
        greeter.greet(to) should be (s"$greetMsg $to")
      }      
    }
  }

}
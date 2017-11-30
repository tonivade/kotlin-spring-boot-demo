package demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Greeter {

  @GetMapping("/greetings")
  fun greetings(@RequestParam(name = "name", defaultValue = "World!") name: String) = "Hello $name!"

}

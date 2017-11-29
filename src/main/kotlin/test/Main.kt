package test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Main {

  @GetMapping("/greatings")
  fun greatings(@RequestParam(name = "name", defaultValue = "World!") name: String) = "Hello $name!"

}

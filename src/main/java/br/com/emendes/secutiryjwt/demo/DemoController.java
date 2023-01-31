package br.com.emendes.secutiryjwt.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/demo")
@Slf4j
public class DemoController {

  @GetMapping
  public ResponseEntity<Map<String, String>> sayHello(Principal principal) {
    log.info("user {} fetch data", principal.getName());
    Map<String, String> map = Map.of("message", "hello from security endpoint", "some data" , "data");
    return ResponseEntity.ok(map);
  }

}

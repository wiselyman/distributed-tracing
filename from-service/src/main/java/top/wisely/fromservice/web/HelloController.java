package top.wisely.fromservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/sync")
    public String sync(@RequestParam String param){
        return restTemplate.getForObject("http://localhost:8082/toSync?param=" + param,String.class);
    }
}

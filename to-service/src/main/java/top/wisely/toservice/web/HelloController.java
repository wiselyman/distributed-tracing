package top.wisely.toservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/toSync")
    public String sync(@RequestParam String param){
        return "来自to-service的同步数据" + param;
    }
}


package de.htw.onlineshop;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Online-Shop läuft!";
    }
}

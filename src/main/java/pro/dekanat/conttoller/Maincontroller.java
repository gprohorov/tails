package pro.dekanat.conttoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by george on 1/13/18.
 */
@RestController
public class Maincontroller {
    @RequestMapping("/")
    public String hello() {
        return "index";
    }
}

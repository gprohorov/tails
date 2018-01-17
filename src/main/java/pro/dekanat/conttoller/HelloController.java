package pro.dekanat.conttoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by george on 1/13/18.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hellopage";
    }
}

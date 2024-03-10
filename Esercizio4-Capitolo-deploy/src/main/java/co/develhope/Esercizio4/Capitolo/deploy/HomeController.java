package co.develhope.Esercizio4.Capitolo.deploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private Environment environment;
    @Value("${myCustomVarTree.welcomeMsg}")
    String welcomeMsg;
    @GetMapping
    public String getMessage(){
        return welcomeMsg;
    }
}

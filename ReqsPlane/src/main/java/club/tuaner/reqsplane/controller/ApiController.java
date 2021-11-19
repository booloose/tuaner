package club.tuaner.reqsplane.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/test/{value}",method = RequestMethod.GET)
    public Object getHello(@PathVariable("value") String value){
        return "hello  "+value;
    }

}

package club.tuaner.reqsplane.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api")
public class ApiController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @RequestMapping(value = "/test/{value}",method = GET)
    public Object getHello(@PathVariable("value") String value){
        return "hello  "+value;
    }

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }

}

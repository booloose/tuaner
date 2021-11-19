package club.tuaner.reqsplane;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "tuaner", autoRefreshed = true)
public class ReqsPlaneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReqsPlaneApplication.class, args);
    }

}

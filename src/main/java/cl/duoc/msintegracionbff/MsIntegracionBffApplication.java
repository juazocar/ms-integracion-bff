package cl.duoc.msintegracionbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsIntegracionBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsIntegracionBffApplication.class, args);
	}

}

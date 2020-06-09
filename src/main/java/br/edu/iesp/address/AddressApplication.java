package br.edu.iesp.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import brave.sampler.Sampler;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = {"br.edu.iesp"})
@SpringBootApplication
public class AddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}

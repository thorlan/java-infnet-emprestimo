package br.edu.infnet.javainjecaopersistenciaemprestimos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class JavaInjecaoPersistenciaEmprestimosApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(JavaInjecaoPersistenciaEmprestimosApplication.class, args);
	}

	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
	}
	
}

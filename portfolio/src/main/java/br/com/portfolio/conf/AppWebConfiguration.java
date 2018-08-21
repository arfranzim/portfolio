package br.com.portfolio.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.portfolio.controllers.HomeController;
import br.com.portfolio.daos.ProjetoDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class, ProjetoDAO.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}

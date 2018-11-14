package com.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@EnableWebSecurity
@ComponentScan({ "com.java" })
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationTrustResolver getAuthenticationTrustResolver() {
	    return new AuthenticationTrustResolverImpl();
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			
			.antMatchers("/resources/**").permitAll()
//			.antMatchers("/product-list/**").authenticated()
//			.antMatchers("/manager-list/**").authenticated()
//			.antMatchers("/admin/**").access("hasRole('ADMIN')")
//			.antMatchers("/contact/create").access("hasRole('CONTACT-MANAGER')")
			.anyRequest().permitAll()
		.and()
			.formLogin()
			.loginPage("/login")
			.loginProcessingUrl("/login")
			.usernameParameter("username")
			.passwordParameter("password")
			.defaultSuccessUrl("/login-success", true)
			.permitAll()
		.and()
			.logout().logoutUrl("/logout")
		.and().csrf()
		.and().exceptionHandling().accessDeniedPage("/denied")
		.and().userDetailsService(userDetailsService);
		
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        http.addFilterBefore(filter,CsrfFilter.class);
	}

}

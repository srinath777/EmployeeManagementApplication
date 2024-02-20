package com.employee.app.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfiguration {

    
	protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().anyRequest().authenticated().and()
                .formLogin().permitAll().loginPage("/login")
                .usernameParameter("username").and().logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).permitAll();

    }
}



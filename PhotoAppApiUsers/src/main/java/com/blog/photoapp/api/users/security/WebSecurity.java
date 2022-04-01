//package com.blog.photoapp.api.users.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//import javax.servlet.Filter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//
//    private Environment environment;
//
//    public WebSecurity(Environment environment) {
//        this.environment = environment;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/users/*").permitAll().and()
//                .addFilter(getAuthenticationFilter());
//        //To allow requests only from the api gateway.
////        http.authorizeRequests().antMatchers("/**").hasIpAddress("<The Zuul API gateway IP addr>");
////        http.authorizeRequests().antMatchers("/**").hasIpAddress(environment.getProperty("gateway.ip")); //gateway.ip has to be in the properties file
//        http.headers().frameOptions().disable();
//    }
//
//    private AuthenticationFilter getAuthenticationFilter() throws Exception {
//        AuthenticationFilter authenticationFilter = new AuthenticationFilter();
//        authenticationFilter.setAuthenticationManager(authenticationManager());
//        return authenticationFilter;
//    }
//}

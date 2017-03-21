package com.tutorial.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hvity on 20.03.2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.tutorial.server")
public class WebConfig extends WebMvcConfigurerAdapter {




}

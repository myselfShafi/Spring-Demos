package com.spring.config;

import com.spring.Device;
import com.spring.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {

// //    JAVA based config start -----
//    @Bean(name = {"device1", "dev1", "dvc1"})
    @Bean
    @Scope("prototype")
    public Device dvc1() {
        return new Device();
    }

    @Bean
    public User u1() {
        return new User();
    }
// //    JAVA based config end -----
}
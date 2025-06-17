package org.example.demo_spring_base.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("salutation")
@Service
@Profile("FR")
// @Primary
public class GreetingServiceFrench implements GreetingService {
    @Override
    public String greet() {
        return "Bonjour monde venant de salutation service français!!! ";
    }
}

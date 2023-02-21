package jjzz.common;


import jjzz.INdexerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { INdexerApplication.class })
public class CucumberSpingConfiguration {
    
}

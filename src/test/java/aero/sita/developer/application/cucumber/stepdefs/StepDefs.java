package aero.sita.developer.application.cucumber.stepdefs;

import aero.sita.developer.application.Application;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Application.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

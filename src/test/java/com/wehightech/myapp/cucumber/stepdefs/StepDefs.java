package com.wehightech.myapp.cucumber.stepdefs;

import com.wehightech.myapp.MyAngularApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MyAngularApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

package ru.roman.steps.hooks;

import io.cucumber.java.Before;
import org.junit.jupiter.api.Test;

public class HookSteps {
    @Before
    public void before() {
        System.out.println("Before sout");
    }
}

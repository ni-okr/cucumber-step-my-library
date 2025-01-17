package ru.roman.runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@SelectClasspathResource("params/zadacha1.feature")
// @SelectClasspathResource("params")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class ParamsTest {
}

package com.notearena;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

import com.notearena.utils.Utilities;



@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suite")
@SelectPackages({"com.notearena.utils","com.notearena.mathutils"})
@SelectClasses(Utilities.class)
public class TestSuite {

}

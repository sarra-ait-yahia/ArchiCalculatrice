package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses ({AdditionTest.class,DivisionTest.class,MultiplicationTest.class,SoustractionTest.class,ControlleurTest.class,ApplicationPropertiesTest.class})
public class SuiteTests {

}

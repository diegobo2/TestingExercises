package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test_front.Buy_product;
import test_front.Login_sauceDemo_test;

@RunWith(Suite.class)
@Suite.SuiteClasses({Login_sauceDemo_test.class, Buy_product.class})
public class TestCycle_sauceDemo {
}

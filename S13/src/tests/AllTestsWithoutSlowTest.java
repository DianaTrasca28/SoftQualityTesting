package tests;


import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import classes.CategorySlowClass;

@RunWith(Suite.class)
//@ExcludeCategory(CategorySlowClass.class);
@SuiteClasses({ TestPersonDetAvg.class, TestPersonConstructor.class })
public class AllTestsWithoutSlowTest {

}


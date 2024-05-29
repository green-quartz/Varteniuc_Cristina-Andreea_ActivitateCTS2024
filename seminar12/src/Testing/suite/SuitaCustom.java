package Testing.suite;

import Testing.PachetTuristicTest;
import Testing.categorii.TesteEror;
import Testing.categorii.TesteRange;
import model.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristic.class})
@Categories.IncludeCategory(TesteEror.class)
@Categories.ExcludeCategory(TesteRange.class)
public class SuitaCustom {
}

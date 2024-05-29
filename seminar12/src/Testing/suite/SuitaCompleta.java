package Testing.suite;

import Testing.PachetTuristicTest;
import model.PachetTuristic;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PachetTuristic.class})
public class SuitaCompleta {
}

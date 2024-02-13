package by.academy;

import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunListener;
import org.junit.runners.model.InitializationError;

public class CalculatorTestListener extends RunListener {

    @Override
    public void testFinished(Description description) throws java.lang.Exception {
        System.out.println("Execution Finished: " + description.getMethodName());
    }

    public static void main(String[] args) throws InitializationError {

        JUnitCore core = new JUnitCore();
        core.addListener(new CalculatorTestListener());

        core.run(TestSuite.class);

        core.run(MultiplyTest.class);
        core.run(SubstractTest.class);
        core.run(SumTest.class);

        core.run(ParametrizeMultiplyTest.class);
        core.run(ParametrizeSubstractTest.class);
        core.run(ParametrizeSumTest.class);
    }
}

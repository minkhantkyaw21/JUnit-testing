package org.example;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;

// This section declares all of the test classes in the program.
@RunWith (Suite.class)
// Add more test classes by inserting a .class file name
//inside the curly brackets, separate by commas.
@Suite.SuiteClasses ({ MinTest.class })  // Add test classes here.
public class AllTest {
    // Execution begins in main(). This test class executes a
// test runner that tells the tester if any fail.
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    // The suite() method helps when using JUnit 3 Test Runners or Ant.
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(AllTest.class);
    }
}
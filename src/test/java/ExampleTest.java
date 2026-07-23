import org.junit.jupiter.api.*;

public class ExampleTest {
    @BeforeEach
    public void setup() {
        System.out.println("setting up test data");

    }

    @Test
    public void testExample1() {
        System.out.println("running test case 1");

    }

    @Test
    public void testExample2() {
        System.out.println("running test case 2");

    }

    @AfterAll
    public static void closeConnections() {
        System.out.println("closing connections");

    }

    @BeforeAll
    public static void createConnections() {
        System.out.println("creating connections");

    }
}
/*
- When this class test is run, what is the output?
- C) creating connections, setting up test data, running test case 1, closing connections


- If we introduce a new @Test annotated method testExample2 and run the test class how many times do we expect the following messages to appear
- @BeforeAll and @AfterAll will invoke as first and last test, @BeforeEach will invoke before each @Test, so that what we expect is:
    creating connections
    setting up test data
    running test case 1
    setting up test data
    running test case 2
    closing connections

------------------------------------------------------------------------------------------------------------------------
** Reflection on key concepts in automated testing **

- Explain why tests should be independent of each other. What benefit does this bring?
- each test should be able to run on its own, so that we can run them with different orders or in parallel where needed, also if one test case failed it does not affect other tests.

- Explain the difference between a test-case, a test class and a test suite. Why might we use test suites?
- test-case: a test method to verify specific behavior
  test class: a class containing related test-cases
  test suite: a collection of test classes grouped together and run as a single unit. https://www.baeldung.com/java-junit-test-suite
  so test suite help us to run many related tests together, organise our test and group our test logically.

- Explain the Junit test lifecycle
- assuming we have all lifecycle annotations:
  first of all JUnit test lifecycle starts with @BeforeAll, then for each test:  @BeforeEach (before each test method) > @Test > @AfterEach (after each test method), then at last on latest step -> @AfterAll (after all test have finished)

- particularly how we can use this to re-use state or reset state between tests and why this is useful from a maintainability and performance perspective.
- @BeforeAll -> when the setup required for tests is expensive, and we’d like to run it only once for all tests in a class. to reuse shared state. like creating DB connection
  @BeforeEach -> when we have some common setup logic to run before each test. to reset state between tests
  @AfterEach -> when we have some common cleanup logic to run after each test. to reset state between tests
  @AfterAll -> when we want to clean up tasks after the integration tests, like closing a database connection, shutting down a container, and freeing up temporary resources.
  https://www.baeldung.com/members/courses/learn-junit/lessons/lesson-1-lifecycle-methods

- Are there situations where a test case might not have any assertions?
- Yes. For example, a test may simply check that a method runs without throwing an unexpected exception. if the method finishes successfully, the test passes.

- What might a test without assertions miss and how could it be improved?
- It might miss incorrect results because it doesn't check whether the output is actually correct. It can be improved by verifying expected behavior.

 */
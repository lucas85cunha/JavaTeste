package br.com.javateste.test;

import org.junit.*;

public class BasicAnnotationTest {

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - Run once before any of the test methods in the class, public static void");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass – Run once after all the tests in the class have been run, public static void");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before – Run before @Test, public void");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("@After – Run after @Test, public void");
    }

    @Test
    public void test_method_1() {
        System.out.println("This is the test method to run, public void");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
}

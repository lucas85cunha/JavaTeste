package br.com.javateste.test.exception;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import javax.naming.NameNotFoundException;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;

public class Exception3Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDivisionWithException() {

        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(containsString("/ by zero"));

        int i = 1 / 0;

    }

    @Test
    public void testNameNotFoundException() throws NameNotFoundException {

        //test type
        thrown.expect(NameNotFoundException.class);

        //test message
        thrown.expectMessage(is("Name is empty!"));

        //test detail
        thrown.expect(hasProperty("errCode"));

    }


}

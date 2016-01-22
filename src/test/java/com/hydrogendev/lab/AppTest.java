package com.hydrogendev.lab;


import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


@RunWith(JUnitParamsRunner.class)
public class AppTest {
    App app = new App();

    @Test
    public void testDecryptMe() throws Exception {
        assertThat(app.decryptMe("em twdm pglzwomv lmd",18),is("we love hydrogen dev"));
    }

    @Test
    public void testShiftAlphabet() throws Exception {
        assertThat(app.shiftAlphabet('a',5),is("f"));
        assertThat(app.shiftAlphabet('a',25),is("z"));
        assertThat(app.shiftAlphabet('a',27),is("b"));
    }


}

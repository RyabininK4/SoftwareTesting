package task1Home;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import java.util.Collection;
import java.util.Arrays;

/**
 * Created by ryabinin_k on 22.05.17.
 */
public class TestSumma extends Assert {
    @Test
    public void testSim() {
        int a = 2;
        int b = 3;
        int c = 5;
        assertEquals(c, Summa.summma(a,b));
    }
}

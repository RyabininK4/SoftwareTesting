package task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import java.util.Collection;
import java.util.Arrays;

/**
 * Created by ryabinin_k on 20.05.17.
 */
public class SumTest extends Assert {

    @Test
    public void testClass1() {
        int a = 2;
        int b = 6;

        int expect = 8;
        assertEquals(7, Sum.sum(a,b));
    }
}

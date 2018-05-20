/**
 * Created by 04385145 on 16.04.2018.
 */

import org.junit.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamMassTest {

    private Main mass;
    private String a;
    private String b;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"[2, 3, 1]","[2, 3, 1]"},
                {"[2, 3, 5]","[2, 3, 2]"},
        });
    }

    public ParamMassTest(String a, String b) {

        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        mass = new Main();
    }

    @Test
    public void ParmMass() {
        Assert.assertEquals(b, mass.mas4(a));
    }
}

   /* int[] b = {1,4,2,3,1};
    String str= "[2, 3, 1]";
        Assert.assertTrue(str.equals(mass.mas1(b)));*/


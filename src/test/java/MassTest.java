import org.junit.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 04385145 on 26.03.2018.
 */
public class MassTest {

    /*
    1. Написать метод, которому в качестве аргумента передается не
    пустой одномерный целочисленный массив, метод должен вернуть новый массив, который получен путем вытаскивания элементов из исходного массива,
    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, в противном случае в методе необходимо
    выбросить RuntimeException.

    Написать набор тестов для этого метода (варианта 3-4 входных данных)
    вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ] */

    private Main mass;

    @Before
    public void startTest()
    {
        mass = new Main();

    }

    @Test
    public void testTask1Compare1()
    {
        int[] b = {1,4,2,3,1};
        String str= "[2, 3, 1]";
        Assert.assertTrue(str.equals(mass.mas1(b)));
    }

    @Test
    public void testTask1Compare2()
    {
        int[] b = {1,2,4,3,1};
        Assert.assertEquals("[3, 1]", mass.mas1(b));

    }

    /*
    2. Написать метод, который проверяет что массив состоит только из чисел 1 и 4. Если в массиве нет хоть одной 4 или 1, то метод вернет false;
    */

    @Test
    public void testTask2Compare1()
    {
        int[] b = {1,2,4,3,1};
        Assert.assertEquals(false, mass.mas3(b));

    }

    @Test
    public void testTask2Compare2()
    {
        int[] b = {1,4,1};
        Assert.assertFalse(false==mass.mas3(b));

    }

}

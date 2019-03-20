import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAfter4 {
    private After4 after4;

    @Before
    public void startTest(){
        after4 = new After4();
    }

    @Test
    public void testOne(){
        int[] out = new int[]{5,6,7,8,9,0};
        int[] in = new int[]{1,2,3,4,5,6,7,8,9,0};
        Assert.assertArrayEquals(out,after4.newMass(in));
    }
    @Test(expected = RuntimeException.class)
    public void testTwo(){
        int[] out = new int[]{5,6,7,8,9,0};
        int[] in = new int[]{1,2,3,5,6,7,8,9,0};
        Assert.assertArrayEquals(out,after4.newMass(in));
    }

    @Test
    public void testThree(){
        int[] out = new int[]{0};
        int[] in = new int[]{1,2,3,4};
        Assert.assertArrayEquals(out,after4.newMass(in));
    }
}

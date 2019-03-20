import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/*
public class TestOneOrFour {

    private OneOrFour oneOrFour;

    @Before
    public void startTest(){
        oneOrFour = new OneOrFour();
    }

    @Test
public void testOne(){

        int[] in = new int[]{1,1,1,1,1,4,4,4,4,4};
        Assert.assertTrue(oneOrFour.newMass(in));
    }
    }
*/

   @RunWith(Parameterized.class)
    public class TestOneOrFour {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1,2,3,4,5},false},
                {new int[]{1,1,1,1,1},false},
                {new int[]{4,4,4,4,4},false},
        });
    }
       private OneOrFour oneOrFour;
       private int[] in;
       private boolean res;

       public TestOneOrFour(int[] in, boolean res ) {
           this.in = in;
           this.res = res;
       }

       @Before
       public void startTest(){
           oneOrFour = new OneOrFour();
       }
       @Test
       public void massTestAdd() {

           Assert.assertEquals(res,oneOrFour.newMass(in));
       }


   }





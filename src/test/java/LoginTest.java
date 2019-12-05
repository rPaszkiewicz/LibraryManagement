import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginTest {
    @Test
    public void ReeadPasswordFromFileTest() {
        String word = "rabbit carrot";
        String[] arr = word.split("\\s");

        Map<Integer,String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(i,arr[i]);

        Assert.assertEquals(arr.length,map.size());
    }
}

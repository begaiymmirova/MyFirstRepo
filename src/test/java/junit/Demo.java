package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void test1() {
        System.out.println("This is test1");
    }

    public boolean catDog(String str) {
        //  if (str.contains("cat") && str.contains("dog")){
        //    return true;
        // }
        //  else {
        //     return false;
        //   }
        int countcat = 0;
        while (str.contains("cat")) {
            str = str.replace("cat", "");
            countcat++;
        }

        int countdog = 0;
        while (str.contains("dog")) {
            str = str.replace("dog", "");
            countdog++;
        }
        if (countcat != 0 && countdog != 0) {
            if (countcat == countdog) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
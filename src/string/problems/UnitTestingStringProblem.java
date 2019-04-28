package string.problems;
import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) throws Exception{
        //Apply Unit Test into all the methods in this package.


        Assert.assertEquals("CAT", "");


        boolean pa = Palindrome.isPalindrome("MOM");
        Assert.assertEquals(true, pa);

        Permutation.permutation("", "ABC");




    }
}

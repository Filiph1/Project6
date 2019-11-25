import java.util.function.IntPredicate;

public class InputProperties {

    public static IntPredicate isOdd()
    {
        IntPredicate predicate =  (value) ->value % 2 == 0 ;

      return predicate;
    }



    public static IntPredicate isPrime(){
    IntPredicate predicate = (value) ->{
        for(int i=2; i < value ; i++)
        {
            if(value % i == 0) {
                return false;
            }

    }
        return true;
    };
    return predicate;
    }


    public static IntPredicate isPalindrome(){
        IntPredicate predicate =  (value) ->{
            int oldValue = value;
            int  newValue = 0;
            while (value != 0) {
                newValue = (newValue * 10) + (value % 10);
                value /= 10;
            }
            return  oldValue == newValue;

        } ;
        return predicate;
    }

    public static boolean check(int a, IntPredicate b)
    {
    return b.test(a);
    }

    public static void main(String[] args) {

        boolean a = check(15, isOdd());
        boolean b = check(7, isPrime());
        boolean c = check(15, isPalindrome());
        boolean d = check(16, isOdd());
        boolean e = check(8, isPrime());
        boolean f = check(151, isPalindrome());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }


}

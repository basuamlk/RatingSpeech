package Project;

/**
 * Created by yassin on 2/20/17.
 */
public class Whatever {

    public static void main(String[] args) {
        FiboNacci();
    }

    static int evensum;
    public static int FiboNacci(){
        for (int i = 0; i < 40; i++){

            int fib1 = 1, fib2 = 1, fibsum = fib1 + fib2;
            evensum = 0;
            if (fibsum % 2 == 0){
                evensum =+ fibsum;
            }
            fib1 = fib2;
            fib2 = fibsum;
            FiboNacci();
        }

//
//        for (fibsum > 4000000) {
//            break;
//        }
        return evensum;
    }
}

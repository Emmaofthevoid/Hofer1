public class Metropolis {
    public static void main(String[] args) {

        System.out.println(isMetropolis(true, 349502835, 405948));
        System.out.println(isMetropolis(false,3477658,568456465));
    }
    // two == not forget, parentesis not forget between the conditions!
    public static boolean isMetropolis (boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
        if  (isCapital && inhabitants > 100000 || (inhabitants > 20000 && (inhabitants*taxPerPersonAndMonth*12) >= 72000000 )) {
            return true;
        }
        else {
            return false;
        }


    }
}

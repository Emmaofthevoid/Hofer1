public class TeilerFinden {
    public static void main(String[] args) {
       findetTeiler(12);

    }

    public static void findetTeiler(int z) {
        int teiler = 2;
        while (teiler < z) {
            if ( (z%teiler) == 0){
                System.out.println(teiler);
            }

            ++teiler;
        }
    }

}



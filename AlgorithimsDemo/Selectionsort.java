class Selectionsort{
    public static String magic2(String s) {

        String strBuilder = "";

        int beginning = 0;

        int end = s.length() - 1;

        

        while(beginning <= end) {

            char c1 = s.charAt(beginning);

            char c2 = s.charAt(end);

            

            if (beginning == end) {

                strBuilder += Character.toString(c1);

            }else {

                strBuilder += Character.toString(c1) + Character.toString(c2);  

            }

            beginning++;

            end--;

        }

        return strBuilder;  

    }
    public static void main(String[] args){
        System.out.print(magic2("fire"));
    }
}
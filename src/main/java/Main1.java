import HW.HW1;

public class Main1 {



    public static void main(String[] args) {

        int a;
        String as = "11222333111 1 { 8 ¿ 2233 22";
        Object as1 = new Object();
        double[] aee = {1,2,3,4};
//        System.out.println(as);
//        System.out.println(as1);
//        System.out.println(aee);
            as = "123 1" +" 102 ";
//        System.out.println(as.indexOf("102"));

         as = as.replace("102","");

          char[] chars = as.toCharArray();

          as = as + chars[2];

            System.out.println( as );
    }




}

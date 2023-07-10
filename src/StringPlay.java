import java.util.StringTokenizer;

import static java.lang.System.out;

public class StringPlay {
    public static void main(String[] args) {

        //StringTokenizer
        int count =0 ;
        StringTokenizer st = new StringTokenizer("LG onida Sony"," ");
        out.println(st.nextToken());
        out.println();
        while (st.hasMoreTokens()){
            out.println(st.nextToken());
            count += st.countTokens();
        }
        out.println(count);

        StringTokenizer st2 = new StringTokenizer("Usha :Crompton:Vguard",":");
        while(st2.hasMoreElements()){
            out.println(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer("Maruthi+Suzuki/Toyota*Honda","+/*");
        while(st3.hasMoreElements()){
            out.println(st3.nextToken());
        }


        out.println(st2.equals(st3));//Comparing

        //String Builder
        StringBuilder sb = new StringBuilder();
        sb.append("I ");
        StringBuilder inse = sb.append("You").insert(2,"Love ");

        out.println("String-builder1 : "+sb);
        out.println(inse);

        StringBuilder sbb = new StringBuilder();
        sbb.append("I Love ").append("You");
        out.println("string-builder1 : "+sbb);
        out.println("Comparing 2 string-builders is "+sb.compareTo(sbb));


        StringBuffer sc = new StringBuffer();
        sc.append("I Love ").append("You");
        out.println("String-buffer : "+ sc);



        //String palindrome in another method
        String strs = "Radar";
        StringBuilder revstr = new StringBuilder();
        for (int i = strs.length() - 1; i >= 0; i--) {
            revstr.append(strs.charAt(i));
        }
        if (strs.equalsIgnoreCase(revstr.toString())) {
            out.println("It is a palindrome ");
        } else {
            out.println("It is not a palindrome");
        }

    }
}

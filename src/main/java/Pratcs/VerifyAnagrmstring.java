package Pratcs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VerifyAnagrmstring {
    public static void verfyanamgramstring(String value1,String value2)
    {
        char [] sc=value1.toCharArray();
        char [] sc1=value2.toCharArray();
        boolean ana=true;
        if (sc.length !=sc.length)
        {
            System.out.println("not an anagram");
        }
        else
        {
            for(Character c : sc)
            {
                Integer cnt1 = CharacterCount.countC(value1, c);
                Integer cnt2 = CharacterCount.countC(value2, c);
                System.out.println(c);
                System.out.println(cnt1);
                System.out.println(cnt2);
                if(cnt2!=cnt1)
                {
                    System.out.println("not a anagram");
                    ana=false;
                    break;
                }
        }
            if (ana)
            {
                System.out.println("<<<<<<<This Is ANAGRAM>>>>>>>>");
            }

        }


    }

    public static void main(String[] args) {
        VerifyAnagrmstring.verfyanamgramstring("aaabbc","cbbaaa");
    }

}

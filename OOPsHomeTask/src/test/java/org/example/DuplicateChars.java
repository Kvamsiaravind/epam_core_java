package org.example;

import java.util.ArrayList;
import java.util.List;

public class DuplicateChars {
    boolean count(char ch,String inputString)
    {
        int countVal=0;
        for(int i=0;i<inputString.length();i++)
        {
            if(ch==inputString.charAt(i))
                countVal++;
            if(countVal>1)
                return true;
        }
        return false;
    }
    public void findDuplicateChars(String inputString)
    {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<inputString.length();i++)
        {
            if(!list.contains(inputString.charAt(i))&&inputString.charAt(i)!=' ')
                list.add(inputString.charAt(i));
        }
        for(char ch:list)
        {
            if(count(ch,inputString))
                System.out.println(ch+" is a duplicate character.");
        }
    }
}

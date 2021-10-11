import java.util.*;

public class makeThreesome
{
    public static String [] makeThreesome(String word)
    {   
        String arr[] = new String[word.length() - 2];
        int start = 0; int i = 0;
        int end = 3;
        while (end != word.length() + 1)
        {
            arr[i] = word.substring(start, end);
            start++;
            end++;
            i++;
        }
        return arr;
    }
} 
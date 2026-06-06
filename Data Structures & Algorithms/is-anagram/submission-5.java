class Solution {
    public boolean isAnagram(String s, String t) {

        try
        {
            if(isStringLengthTheSame(s, t))
            {
                //Convert individual strings to byte array
            char[] firstString = s.toCharArray();
            char[] secondString = t.toCharArray();

            //Sort each string array
            Arrays.sort(firstString);
            Arrays.sort(secondString);

            //Check if each letter match
            for(int a = 0; a < firstString.length; a++)
            {
                if(firstString[a] != secondString[a])
                    return false;
            }
            return true;
            }
            else
                return false;        
        }
        catch(Exception ex)
        {
            System.out.print(ex.toString());
            return false;
        }
    }

    public boolean isStringLengthTheSame(String s, String t)
    {
        try
        {
            if(s.length() == t.length())
                return true;
            else
                return false;
        }
        catch(Exception ex)
        {
            System.out.print(ex.toString());
            return false;
        }
    }
}


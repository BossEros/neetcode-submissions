public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length)
            return false;

        char[] firstWord  = s.ToCharArray();
        char[] secondWord = t.ToCharArray();
        Array.Sort(firstWord);
        Array.Sort(secondWord);

        return firstWord.SequenceEqual(secondWord);
    }
}

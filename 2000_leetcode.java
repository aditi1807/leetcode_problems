class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>st=new Stack<>();
        String s="";
        for(int i=0;i<word.length();i++)
        {
            st.push(word.charAt(i));
            if(word.charAt(i)==ch)
            {
                while(!st.isEmpty())
                {
                    s+=st.pop();
                }
                s+=word.substring(i+1);
                break;
            }
            
        }
        if(st.isEmpty())
        return s;
        else
        return word;
    }
}
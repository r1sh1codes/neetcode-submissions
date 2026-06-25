class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder max = new StringBuilder("");
        String first = strs[0];
        for(int i  = 0 ; i < first.length();i++)
        {
            boolean isValid = true;
            for(int j = 1;j<strs.length;j++)
            {
                String temp = strs[j];
                if(i<temp.length() && temp.charAt(i) != first.charAt(i))
                {
                    isValid = false;
                    break;
                }
                else if(i>=temp.length())
                {
                    isValid = false;
                    break;
                }
            }
            if(isValid)
            {
                max.append(first.charAt(i));
            }
            else
            {
                break;
            }
        }
        return new String(max);
    }
}
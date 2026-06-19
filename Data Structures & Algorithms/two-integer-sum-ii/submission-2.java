class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int p = 0;
     int q = numbers.length - 1;
     while(p<q)
     {
        int sum =  numbers[p] + numbers[q];
        if(sum >target)
        {
            q--;
        }
        else if(sum < target)
        {
            p++;
        }
        else
        {
            int[] res = new int[2];
            res[0] = p+1;
            res[1] = q+1;
            return res;
        }
        
     }  
     return new int[0]; 
    }
}

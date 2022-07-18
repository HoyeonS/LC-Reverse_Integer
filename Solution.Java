class Solution {
    public static int getDigit(int x)
    {
        int count = 1;
        int a = x;
        
        while(a/10 > 0)
        {
            count++;
            a = a/10;
        }
        return count;
    }
    public int reverse(int x) {
        int result = 0;
        int c = Math.abs(x);
        int tmp = 1;
        int counter = 0;
        int digit = getDigit(c) - 1;
        boolean neg = x < 0;
        while(c != 0)
        {
            tmp = (int)(c / Math.pow(10, digit));
            result += tmp * Math.pow(10, counter);
            c -= tmp * Math.pow(10, digit);
            digit--;
            counter++;
            if(result > Math.pow(2,31) - 2 || result < Math.pow(-2,31) + 1)
            {
                return 0;
            }
        }
        if (neg)
            result *= -1;
        return result;
    }
}
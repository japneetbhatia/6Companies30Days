class uglyNumber {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long[] ugly = new long[n];
        ugly[0] = 1;
        long ctr = 1;
        int idx2 = 0;
        int idx3 = 0;
        int idx5 = 0;
        
        while(ctr < n) {
            long nxt2 = ugly[idx2] * 2;
            long nxt3 = ugly[idx3] * 3;
            long nxt5 = ugly[idx5] * 5;
            
            long nxtN = Math.min(nxt2, Math.min(nxt3, nxt5));
            
            if(nxtN == nxt2) idx2++;
            if(nxtN == nxt3) idx3++;
            if(nxtN == nxt5) idx5++;
            
            ugly[(int)ctr++] = nxtN;
        }
        return ugly[n - 1];
    }
}
class subArray {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        long ptr = 0;
        long si = 0;
        long psf = 1;
        int ctr = 0;
        
        while(ptr < n) {
            psf *= a[(int)ptr];
            while(si < n && psf >= k) {
                psf /= a[(int)si];
                si++;
            }
            if(psf < k) {
                ctr += (int)(ptr - si + 1);
            }
            ptr++;
        }
        
        return ctr;
    }
}
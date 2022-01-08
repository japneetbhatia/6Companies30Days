class missingRepeating {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] freq = new int[n+1];
        for(int i = 0; i < n; i++)
            freq[arr[i]]++;
            
        int[] res = new int[2];
        for(int i = 1; i <= n; i++) {
            if(freq[i] == 0) res[1] = i;
            if(freq[i] == 2) res[0] = i;
        }
        
        return res;
    }
}
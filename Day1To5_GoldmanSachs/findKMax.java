class findKMax {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr) {
            pq.add(ele);
            if(pq.size() > k) 
                pq.remove();
        }
        
        int[] res = new int[k];
        int i = k;
        while(pq.size() != 0)
            res[--i] = pq.remove();
            
        return res;
    }
}
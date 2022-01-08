class canPair {
    public boolean canPair(int[] arr, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
		    map.put( (arr[i] % k), map.getOrDefault( (arr[i] % k) , 0) + 1 );
		}
        
        boolean res = true;
		for(int key : map.keySet()) {
		    if(key == 0 || ( k % 2 == 0 && k/2 == key) ) {
		        if(map.get(key)%2 != 0) {
		            res = false;
		            break;
		        }
		    } else {
		        if( (!map.containsKey(k - key)) || (map.get(key) != map.get(k - key))) {
		            res = false;
		            break;
		        }
		    }
		}
		
		return res;
    }
}
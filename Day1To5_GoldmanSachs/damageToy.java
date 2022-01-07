class damageToy {
    static int findPosition(int N , int M , int K) {
        // code here
        int last = (K + M - 1) % N;
        return last == 0 ? N : last;
    }
};
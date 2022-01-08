class chessboard {
    static Long squaresInChessBoard(Long N) {
        // code here
        if(N == 1) return N;
        Long ans = (N * (N+1) * ((2 * N) + 1))/6;
        return ans;
    }
};
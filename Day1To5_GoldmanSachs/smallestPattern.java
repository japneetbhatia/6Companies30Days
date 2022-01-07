class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'D') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while(st.size() > 0) {
                    sb.append(st.pop());
                }
            }
        }
        st.push(num);
        while(st.size() > 0) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
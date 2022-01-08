class decodeString{
    Boolean isNumber(char ch) {
        if(ch >= '0' && ch <='9') return true;
        return false;
    }
    int i = 0;
    String decodedString(String s){
        // code here
        StringBuilder result = new StringBuilder();
        while(i < s.length() && s.charAt(i) != ']'){
            if(isNumber(s.charAt(i))){
                int k = 0;
                while(i < s.length() && isNumber(s.charAt(i)))
                    k = k*10 + s.charAt(i++) - '0';
                i++;
                String r = decodedString(s);
                while(k-- > 0)
                    result.append(r);
                i++;
            } else
                result.append(s.charAt(i++));
        }
        return result.toString();
    }
}
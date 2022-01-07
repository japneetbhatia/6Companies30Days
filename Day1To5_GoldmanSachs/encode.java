class GfG
 {
	String encode(String str)
	{
          //Your code here
          StringBuilder sb = new StringBuilder();
          if(str.length() == 1) {
              sb.append(str.charAt(0));
              sb.append(1);
              return sb.toString();
          }
          char prevChar = str.charAt(0);
          int i = 1;
          while(i <= str.length()) {
              int ctr = 1;
              while(i < str.length() && prevChar == str.charAt(i)) {
                  ctr++;
                  prevChar = str.charAt(i);
                  i++;
              }
              
              sb.append(prevChar);
              sb.append(ctr);
              if(i == str.length()) break;
              prevChar = str.charAt(i);
              i++;
          }
          return sb.toString();
	}
	
 }
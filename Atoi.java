class Atoi{
  public int stringAtoi(String s){
    int len = s.length();
    char[] ch = s.toCharArray();
    int num = 0;
    int sign = 1;
    int i = 0;
    
    while(i<len && s.charAt(i) == ' '){ // remove spaces in start
      i++;
    }

    if(i<len && (s.charAt(i) =='+' || s.charAt(i)=='-')){ // checks if '-' comes in front example -42 or 42
      if(s.charAt(i)=='-'){
        sign = -1; // assign -1 if '-' 
      }
      if(s.charAt(i)=='+'){
        sign = 1;
      }
      i++; // increment for further numbers
    }
      
      while(i<len && Character.isDigit(ch[i])){ // loops till i is digit
      int digit = ch[i] - '0'; // get u correct value by ascii example[ ch = '7' , so '7' - '0' = 55-48 = 7, where '0' = 48 ( ascii value)]
      if(num>(Integer.MAX_VALUE - digit)/10){ // checks overflow 
        if(sign ==1){ 
          return Integer.MAX_VALUE;
            }
        else if(sign==-1){
          return Integer.MIN_VALUE;
        }
      }
      num = num*10 + digit; // adds number one by one till all conditions satisfies( digit or - , + )( not charecters)
      i++;
    }
    return sign*num; // returns with sign at last 
  }
}



   

    
     



    
 

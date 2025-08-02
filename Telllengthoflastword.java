class Solution{
public String(String s){
  int m = s.length()-1; // help tp start from end of string
  int count = 0; // count of words
  while(i<=0 && s.CharAt(i) == ' ') // 
    { i--;}  // skips spaces when started from end and increment pointer to forward from ending
  while(i>=0 && s.charAt(i) ! =' '){
    count++;
    i--;
  }
  return count;
}


 
    }
        
 
 
}

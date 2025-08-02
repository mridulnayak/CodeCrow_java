class Solution{
public String(String s){
  int m = s.length()-1; // help tp start from end of string
  int count = 0; // count of words
  while(i<=0 && s.CharAt(i) == ' ') // loop to skip spaces 
    { i--;}  // skips spaces when started from end and increment pointer to forward from ending
  while(i>=0 && s.charAt(i) ! =' '){// loop to count the alphabet of last word and increment count 
    count++;
    i--;// and then also carry on the loop
  }
  return count; //returns count of alphabet or size of word at end
}


 
    }
        
 
 
}

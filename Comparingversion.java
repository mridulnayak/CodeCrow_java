class Comparingversion{
  public int cv(String s){
    String [] v1 = version1.split("\\."); // split the version number into array 
    String [] v2 = version2.split("\\."); // example 1.10 to [1,10]
    int len = Math.max(v1.length, v2.length); // find max length in 2 versions
    for(int i=0;i<len;i++){
      int num1=0; // initialize and also give value as zero if any version length is smaller than other for that iteration 
      int num2=0;
      if(i < v1.length){ // convert if loop runs and not out of bounds if out pf bound then already there is num1/num2 = 0
        num1 = IntegerparseInt(v1[i]);
      }
      if(i<v2.length){
        num2 = Integer.parseInt(v2[i]);
      }
      if(num1>num2){
        return 1;
      }
      if(num1<num2){
        return -1;
      }
    }
    return 0;
  }
}

        
      

  

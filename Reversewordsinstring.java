class solution{
  public String(String[] s){
    s = s.trim().replaceAll("\\s+"," ");
    String[] words = s.split(" ");

      for(int i=0;i<nums.length/2;i++){
      String temp = words[i];
      words[i] = words[words.length-1-i];
      words[words.length-1-i] = temp;
    }
    return String.join(" ",words);
  }
}
      

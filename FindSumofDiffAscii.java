

class FindSumofDiffAscii{
    public int method(String s){
        int sum = 0;
        char [] c = s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            sum+= Math.abs(c[i]-c[i+1]);
            }
    
    return sum;
    }
    public static void main(String[] args) {
        String s = "abcd";
        FindSumofDiffAscii fsd = new FindSumofDiffAscii();
        int sum = fsd.method(s);
        System.out.println("Sum of differences in ASCII values: " + sum);
}}
//converting string to character array by toCharArray() method
//using Math.abs() to get absolute difference between ASCII values of characters


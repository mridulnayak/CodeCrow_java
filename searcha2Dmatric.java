class Solution{
  public int method(int[][] matrix, int target){
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length;j++){ //matrix[i] used such that it can go throug all element/columns in particular row
        if(target==matrix[i][j]){
          return true;
        }
      }
    }
    return false;
  }
}

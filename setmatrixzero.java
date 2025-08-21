class SetMatrixZero{
  public static void setTozero(int matrix[][]){
int rows = matrix.length; // length of row
int cols = matrix[0].length; // length of column
HashSet<Integer> rowszero = HashSet<>(); // to identify unique row having zero

HashSet<Integer> colsszero = HashSet<>(); // to identify unique column having zero
for(int i =0;i<rows;i++){

    for(int j=0;j<cols;j++){
      if(matrix[i][j]==0){
        rowszero.add(i); // add index of row which is zero
        colszero.add(j); // same as upper but for columns
      }
    }
}
    for(int i =0;i<rows;i++){

    for(int j=0;j<cols;j++){
      if(rowszero.contains(i) || colszero.contains(j)){ 
matrix[i][j]=0; // checks whether it contains zero in rows or column and then swap their current value with zero
      }
    }
    }
  }
}

    

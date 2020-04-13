public class MagicSquare {
  public static void main(String[] args){
     int x = 7;
     int magic[][] = new int[x][x];
     int y = (x/2);
     int z = (x * x) - 1;
     int col = y + 1, row = x - 1;
     magic[0][y] = 1;
        System.out.println("Magic Square");
     for(int i = 0; i < z; i++){
            if( row <= -1){
             row = x-1;
         }
            if(col > (x-1) ){
             col = 0;
            }
         if(magic[row][col] == 0){
                magic[row][col] = i + 2;
                if (row == 0 && col == x - 1){
                    row = 1;
                    col = x - 1;
                }else{
                    col ++;
                    row --;
                }
        }else if(magic[row][col] != 0){
                col = col - 1;
                row = row + 2; 
                magic[row][col] = i + 2;
                col ++;
                row --;
            }
     }
      for(int i = 0; i < x; i++){
         for( int j = 0; j < x; j++){
             System.out.print(magic[i][j] + "\t");
         }
            System.out.println();
      }
  }  
}

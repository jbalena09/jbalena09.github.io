/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plane;

/**
 *
 * @author User
 */
public class AirPlane {

    private String arr[][] = new String[13][6];

    public AirPlane() {
    }

    public void print() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 6; j++) {
                    if(this.arr[i][j] != "x\t"){
                    this.arr[i][j] = "*\t";
                    }
                System.out.print(this.arr[i][j]);
            }
            System.out.println("");
        }
    }
    public void reserve(int row, int col){
        if(arr[row][col] != ("x\t")){
            this.arr[row][col] = "x\t";
        }else{
            System.out.println("Seat Taken.Please choose another seat number!");
        }
    }
}

package MatrixOperations;

public class MatrixOperation {
    int[][] arr1;
    int[][] arr2;
    
    public MatrixOperation(){
        arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }

    public MatrixOperation(int[][] arr1){
        this.arr1 = arr1;
    }


    public String toString(){
        String str = "{\n";
        if(this.arr1.length != 0){
        for(int i = 0;i<arr1.length;i++){
            str+="{";
            for(int j=0;j<arr1[i].length;j++){
                if(j!=arr1[i].length-1){
                str+=arr1[i][j]+",";
                }
                else{
                    str+=arr1[i][j];
                }
            }
            if(i!=arr1.length-1){
            str+="},\n";
            }
            else{
                str+="}\n";
            }
        }
        str+="}";
        }

        else{
            str = "{}";
        }
        return str;
    }

    public static void main(String args[]){
        MatrixOperation m = new MatrixOperation(new int[][]{{2,3,4,4},{4,5,6,7},{3,1,2,4}});
        System.out.println(m);
    }
}

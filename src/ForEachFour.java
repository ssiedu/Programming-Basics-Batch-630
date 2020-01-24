
public class ForEachFour {
    public static void main(String[] args) {
        int x[][]={{1,2},{3,4},{5,6},{7,8},{9,10}};
        
        for(int row[]:x){
            for(int col:row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
        
    }
}

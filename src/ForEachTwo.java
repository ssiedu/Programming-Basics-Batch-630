
public class ForEachTwo {
    /**
     * this method is 
     * for adding array elements
     */
    public static void sum(int ar[]){
        int sum=0;
        for(int num:ar){
            sum=sum+num;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {

        int x[]={10,20,30,40,50};
        int y[]={11,12,13,14,15,16,17,18,19,20};
        int z[]={2,4,6,8};
        sum(x);
        sum(y);
        sum(z);
    }
}


public class ForEachFive {
    static int count;
    public static void main(String[] args) {
        
        char ch[]={'a','b','i','d','e','o','x','y'};
        for(char c:ch){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println("Total Vowels  : "+count);
        /*
        boolean b[]={true,false,false,true,true,true,false};
        int totalTrue=0;
        int totalFalse=0;
        
        for(boolean val:b){
            if(val==true){
                totalTrue++;
            }else{
                totalFalse++;
            }
        }
        System.out.println("Total True Values : "+totalTrue);
        System.out.println("Total False Values : "+totalFalse);
        */
        
    }
}

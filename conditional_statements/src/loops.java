public class loops {
    public static void main(String[] args){

        int i = 1;
        int j = 1;

        for(i=1;i<=5; i++){
            if(i%2 != 0){
                for(j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
            }
            if(i%2==0){
                for(j=1;j<=(2*i-1);j++){
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}



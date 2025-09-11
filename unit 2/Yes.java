public class Yes{
    public static void main(String[] args){
        //String test = "this is a string";
        boolean on = true;
        int i = 0;
        while(on == true){
            // for(int i = test.length()-1; i > -1; i --){
	        //     System.out.println(test.substring(i,i+1));
            // }
            System.out.println(i);
            i ++;
            if(i>1e9){
                on = false;
            }
        }
    }
}
    


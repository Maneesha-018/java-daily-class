public class compare {
    public static void main(String[] args) {
        
        //******{there are 3 types by which we can compare strings.1:==, 2: .equals(),3:.equals ignor case() }******//
       
        //1. ==: this only checks are two strings and more then two strings belongs from the same referance or not.//
        String myname = "maneesha";
        String name = "tasu";
        // System.out.println(name);

        // if(myname==name){
        //     System.out.println("value of str is same.");
        // }
        // else{
        //     System.out.println("value of str are not same.");
        // }

        //2. .equals: .equals is case sensitive.//
        // if(myname.equals(name)){
        //     System.out.println("value of str is same.");
        // }
        // else{
        //     System.out.println("value of str are not same.");
        // }


        //3. .equals ignor case: .equals ignor case is not case sensitive.
        String name1 = "maneesha";
        String name2 = "Maneesha";
        if(name1.equalsIgnoreCase(name2)){
             System.out.println("value of str is same.");
        }
        else{
             System.out.println("value of str is not same.");
        }
    }
    
}

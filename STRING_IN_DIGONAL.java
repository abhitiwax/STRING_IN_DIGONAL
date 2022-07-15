/*
In this code input string should be in odd count
example:
input- cricket
output-
c     t
 r   e
  i k
   c
  i k
 r   e
c     t
*/
public class STRING_IN_DIGONAL {
    public static void main(String[] args) {
        String s="cricket";
        int t1=0,t2=s.length()-1,tt1=(s.length()/2)-1,tt2=(s.length()/2)+1;
        for(int i=0;i<(s.length()/2)+1;i++){
            for(int j=0;j<s.length();j++){
            if(t1==j || t2==j){
                System.out.print(s.charAt(j));
            }else {
                System.out.print(" ");
            }
            }
            t1++;t2--;
            System.out.println();
        }
        for(int i=0;i<(s.length()/2);i++){
            for(int j=0;j<s.length();j++){
                if(j==tt1 || j==tt2){
                    System.out.print(s.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            tt1--;tt2++;
            System.out.println();
        }
    }
}

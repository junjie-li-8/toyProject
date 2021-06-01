
public class Tmp1 {
    public static void appendBuffer(StringBuilder buffer,int a){

        if(a==0){
            buffer.append("123");
        }
    }
    public static StringBuilder testMethod(){
        StringBuilder buffer = new StringBuilder();
        int a =0;
        if(a==0){
            buffer.append("123");
        }
        return buffer;
    }
    public void main(String[] args){
        testMethod();
    }
}

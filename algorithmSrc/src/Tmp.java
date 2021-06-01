import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Tmp {
    public static StringBuilder appendBuffer(StringBuilder buffer,int a){

        if(a==0){
            buffer.append("123");
        }
        return buffer;
    }
    public static void testMethod(){
        StringBuilder buffer = new StringBuilder();
        int a =0;
        appendBuffer(buffer,a);
    }
    public static void main(String[] args) {
        testMethod();
    }
}


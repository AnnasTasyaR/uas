import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTS1E {
    public static void main(String[]args)throws IOException {
        float _f1;
        float _f2;
        float _f3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input 3 angka decimal dipisahkan dengan spasi =");
        String[] s_ = reader.readLine().split(  " ");
        if(s_.length!=3){
            System.out.println("Cannot continue");
        }else if (s_.length==3){
            _f1 = Float.parseFloat(s_[0]);
            _f2 = Float.parseFloat(s_[1]);
            _f3 = Float.parseFloat(s_[2]);
            float result = _f1 * _f2 * _f3;
            if(result > 35.4f){
                System.out.println("statatus is B..");
            }else{
                for(int index=0; index<3; index++){
                    System.out.println(" teh day is amazing..");
                    System.out.println(_f1*_f2*_f3);

                }
            }
        }
 }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String st[]=s.split(" ");
        int a[]=new int[st.length-2];
        int idx=0;
        for(int i=0;i<st.length-2;i++){
            if(idx==2 || idx==6) continue;
            a[i]=Integer.parseInt(st[idx]);
            idx++;
        }
        boolean res=true;
        for(int i=0;i<st.length;i++){
            if((a[i]+a[i+1])%2!=0) res=false;
        }
        boolean vow=true;
        if(s.charAt(2)!='A' || s.charAt(2)!='E'||s.charAt(2)!='I'||s.charAt(2)!='O'||s.charAt(2)!='U'||s.charAt(2)!='Y'){
            vow=false;
        }

        if(res==true && vow==true) System.out.println("valid");
        else System.out.println("invalid");

    }
}

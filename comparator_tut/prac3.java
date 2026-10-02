
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class rail{
    private int arrtim;
    private int deptime;

    rail(int arrtime,int deptime){
        this.arrtim=arrtime;
        this.deptime=deptime;
    }

    public int getArrtim() {
        return arrtim;
    }

    public int getDeptime() {
        return deptime;
    }

    @Override
    public String toString() {
        return "rail [arrtim=" + arrtim + ", deptime=" + deptime + "]";
    }

    

    
}




public class prac3 {

    public static void main(String[] args) {
        List<rail> sts=new ArrayList();

        sts.add(new rail(900, 920));
        sts.add(new rail(945, 1130));
        sts.add(new rail(955, 1150));
        sts.add(new rail(1100, 1200));
        sts.add(new rail(1500, 1900));
        sts.add(new rail(1800, 2000));

        Comparator<rail> c1=Comparator.comparing(rail::getArrtim).thenComparing(rail::getDeptime);
        // Comparator<rail> c1=Comparator.comparing(rail::getDeptime);
        Collections.sort(sts,c1);
        // System.out.println(sts);

        int freetime=sts.get(0).getDeptime();
        int noOfPfs=1;
        for(int i=1;i<sts.size();i++){
            if(sts.get(i).getArrtim()<=freetime){
                noOfPfs++;
            }else{
                freetime=sts.get(i).getDeptime();
            }
        }

        System.out.println(noOfPfs);
    }
    
}

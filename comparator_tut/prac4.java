
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class job{
    int index;
    int deadline;
    int profit;

    

    public int getIndex() {
        return index;
    }



    public int getDeadline() {
        return deadline;
    }



    public int getProfit() {
        return profit;
    }



    job(int index,int deadline, int profit){
        this.index=index;
        this.deadline=deadline;
        this.profit=profit;
    }



    @Override
    public String toString() {
        return "job [index=" + index + ", deadline=" + deadline + ", profit=" + profit + "]";
    }


    
}




public class prac4 {
    public static void main(String args[]){
        ArrayList<job> jobs=new ArrayList<>();

        jobs.add(new job(1, 4, 20));
        jobs.add(new job(2, 1, 10));
        jobs.add(new job(3, 1, 40));
        jobs.add(new job(4, 1, 30));

        Comparator<job> c1=Comparator.comparing(job::getDeadline).thenComparing(job::getProfit).reversed();

        
        Collections.sort(jobs,c1);
        int maxDeadline=jobs.get(0).getDeadline();

        int s=0,c=0;
        for(int d=0;d<maxDeadline;d++){
            s+=jobs.get(d).getProfit();
            c++;
        }

        System.out.println(jobs);
        System.out.println("Profit:"+s);
        System.out.println(c);

    }
    
}

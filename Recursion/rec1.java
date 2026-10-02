class prnt{
    int c=0;
    public void print(){
        if(c==5)        //note here the method prints form 0 to 4...that means it prints one number less..but same number of numbrs
            return;
        else{
            System.out.println(c);
            c++;
            print();
        }

    }
}
class rec1{
    public static void main(String args[]){
        prnt ob=new prnt();
        ob.print();
    }
}
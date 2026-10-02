import java.util.*;
class Solution {
    public boolean digitCount(String num) {
        Scanner sc=new Scanner(System.in);
        num=sc.next();
        int n=num.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int f=0;
            char c=num.charAt(i);
            char key=c;
            if(mp.containsKey(key)) f=mp.get(key);
            f++;
            mp.put(key,f);
        }
            //fetch:
            int q=sc.nextInt();
            for(Map.Entry<Character,Integer> e:mp.entrySet()){
                if((int)e.getKey()==e.getValue())
                    return true;
                else
                    return false;
            }
        return false;
            
        }
    }

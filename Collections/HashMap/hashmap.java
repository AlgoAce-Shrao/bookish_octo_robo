import java.util.*;
class hashmap{
    public static void main(String[] args){
        //country(key), population(value)
        HashMap<String,Integer> map=new HashMap<>();

        //insertion operation
        map.put("India ", 120);
        map.put("China", 150);
        map.put("USA", 30);

        //print
        // System.out.println(map);
        //output: {USA=30, China=150, India =120}
        //Note: HashMap is an unordered map...it can give any key and value pair at any sequence

        map.put("China", 180);// since the key is same...it will update the value of the given key
        System.out.println(map);
        //output: {USA=30, China=180, India =120}

        // //Search
        // if(map.containsKey("China")){
        //     System.out.println("Key is present in the map");
        // }else{
        //     System.out.println("Key is present in the map");
        // }

        // //to get the value of the particular key
        // System.out.println(map.get("China"));//key exists-->will give the value
        // System.out.println(map.get("Indonesia"));//key doesn't exists-->will give  null value
 
        //iteration in hashmap
        for( Map.Entry<String,Integer> mp:map.entrySet()){ //
            System.out.println(mp.getKey()+":"+mp.getValue());
        }

        // //2nd method
        // Set<String> keys=map.keySet();
        // for(String key:keys){
        //     System.out.println(key+":"+map.get(key));
        // }
        //remove
        map.remove("China");
        System.out.println("After performing remove operation");
        for( Map.Entry<String,Integer> mp:map.entrySet()){ //
            System.out.println(mp.getKey()+":"+mp.getValue());
        }
    }
}
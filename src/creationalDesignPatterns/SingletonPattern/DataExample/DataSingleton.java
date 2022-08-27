package creationalDesignPatterns.SingletonPattern.DataExample;

import java.util.HashMap;

public class DataSingleton {

    private Integer i = 0;
    private final HashMap<Integer, String> mapping;
    private static DataSingleton instance = new DataSingleton(new HashMap<>());

    private DataSingleton(HashMap<Integer, String> mapping) {
        this.mapping = mapping;
    }

    public static DataSingleton getInstance() {
        return instance;
    }

    public void connection() {
        System.out.println("You are connected to " + this.hashCode());
    }

    public Integer insert(String name) {
        var index = i;
        mapping.put(index, name);
        i++;
        return index;
    }

    public void view(String name){
        for (int j = 0; j < mapping.size(); j++) {
            if(mapping.get(j).equals(name)){
                System.out.println("Name at index: "+ j);
                return;
            }
        }
        System.out.println("No such name exists");
    }

    public Integer update(Integer index , String name) {
        mapping.put(index, name);
        return index;
    }

    public void delete(Integer index){
        mapping.remove(index);
    }

    public void display(){
        System.out.println(mapping);
    }
}

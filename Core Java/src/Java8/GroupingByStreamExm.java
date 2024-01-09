package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class employee{
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "employee [name=" + name + ", id=" + id + "]";
    }

    
}

public class GroupingByStreamExm {
    public static void main(String[] args) {
        // String input = "welcome to code decode and code decode welcomes you";
        // List<String> list = Arrays.asList(input.split(" "));
        // System.out.println(list);

        // Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // System.out.println(map);

        List<employee> listEmp = new ArrayList<>();
        listEmp.add(new employee(1, "Shubham"));
        listEmp.add(new employee(2, "Yash"));
        listEmp.add(new employee(3, "Shekhar"));
        listEmp.add(new employee(4, "Saumya"));
        listEmp.add(new employee(5, "Saumya"));
        listEmp.add(new employee(6, "Shubham"));
        listEmp.add(new employee(7, "Yash"));

        // Map<String, List<employee>> map = listEmp.stream().collect(Collectors.groupingBy(employee::getName));
        // map.entrySet().forEach(System.out::println);
        listEmp.stream().collect(Collectors.groupingBy(employee::getName)).entrySet().forEach(System.out::println);

    }
}

package Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;

// // write String S 

// class Employee {
//     String name;
//     int age;
//     int salary;
// }

// // HashSet<ArrayList> set = new HashSet<>();

// public class Test {
//     public static void main(String[] args) {
//         // String s = "Shubham"; // 
//         // String s1 = s;
//         // s=s+"pandey";
//         // System.out.println(s1);
//         // String s12 = new String("Shubham");

// //         find the list of leaders in the array (Leaders are those elements who is greater than all elements present at its right)
// // eg. [40,32,34,12,15,6]
// // answer = [40,34,15,6]

//         int[] a = {40,32,34,12,6,15};
//         List<Integer> res = new ArrayList<>();

//         int num =0;
//         for(int i = a.length-1; i>=0; i--){
//             if(a[i]>num){
//                 res.add(a[i]);
//                 num = a[i];  //15, 34
//             }
//         }
//         System.out.println(res);
//     }
// }


// Immutability

// Data security

// store data members in HashSet
// interface vs abstract classes
// functional interface
// lambda expression














































class User {

}

// @RestController
// class Controller {

//     @Autowired
//     ServiceClass serviceClass;

// @RequestMapping("/start")                                     //      /start/get

// @GetMapping("/get")
// public List<User> getUserDetails(){

//     List<User> userDetails = serviceClass.getUserDetails;

//     return userDetails;


// }

// @PostMapping("/addUser")                                               
// public User addUser(@ResponseBody User userBody){
//     List<User> users = serviceClass.addUser(userBody);
//     return users;
// }


// // email should be valid, age >20, 
// }



// this is a sample string
//  int[], 


// public class Test {
//     public static void main(String[] args) {
//         String sample = "this is a sample string";
//         getCount(sample);
//     }

//     static int getCount(String sample){
//         int result[] = new int[Integer.MAX_VALUE];
//         int len = sample.length();
//         for(int i=0; i<len; i++){
//             result[sample.charAt(i)]++;
//         }

//         char[] ch = new char[sample.length()];

//         for(int i =0; i<len; i++){
//             ch[i] = sample.charAt(i);
//             int count = 0;
//             for(int j =0; j<=i; j++){
//                 if(sample.charAt(i)==ch[j]){
//                     count++;
//                 }
//                 if(count == 1){
//                     System.out.println("Occurence of"+sample.charAt(i)+" is: "+result[sample.charAt(i)]);
//                 }
//             }
//         }


//         return 0;
//     }
        
//     }












/**
 * Test
 */


//stored procedure

// CREATE Procedure procedure_name AS sql_query GO;

// EXEC procedure_name;


//Triggers

// [14:31] Ankit Chaudhary
// I/P : employee object list
// O/P: print the name of 3rd highest salaried senior(by age) employee 
 
// employee object-  name ,salary,age,id
 
// emplist.add(new Employee(101, "vinod", 25, 10000));
// emplist.add(new Employee(107, "kumar", 35, 20000));
// emplist.add(new Employee(103, "ravi", 15, 5000));
// emplist.add(new Employee(100, "charan", 35, 10000));
// emplist.add(new Employee(100, "rama", 45, 10000));
// emplist.add(new Employee(110, "navi", 55, 30000));
// emplist.add(new Employee(110, "abc", 65, 30000));
// emplist.add(new Employee(110, "dummy", 75, 30000));

public class Test {

    public static void main(String[] args) {
        List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(101, "vinod", 25, 10000));
        emplist.add(new Employee(107, "kumar", 35, 20000));
        emplist.add(new Employee(103, "ravi", 15, 5000));
        emplist.add(new Employee(100, "charan", 35, 10000));
        emplist.add(new Employee(100, "rama", 45, 10000));
        emplist.add(new Employee(110, "navi", 55, 30000));
        emplist.add(new Employee(110, "abc", 65, 30000));
        emplist.add(new Employee(110, "dummy", 75, 30000));

        // emplist.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())))
        // .entrySet().stream().sorted(Collections.rever)

       int thirdHighest = emplist.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);

       System.out.println(thirdHighest);
    }
}

class Employee{
    int id;
    String name;
    int age;
    int salary;

    public Employee(int id, String name, int age, int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //constructor
    //getters setters
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
}











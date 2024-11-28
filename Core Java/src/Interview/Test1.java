package Interview;

// public class Test1 {
//     public static void main(String[] args) {
//         List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

//         // Set--> 
//         //15, 98  //frequency
//         Set<Integer> set = myList.stream().filter(i-> Collections.frequency(myList, i)>1).collect(Collectors.toSet());

//         System.out.println(set);

//     }
// }




// Find an Index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes



// A[] = {-7, 1, 5, 2, -4, 3, 0}
// Output is 3 because A[0] + A[1] + A[2] = A[4] + A[5] + A[6]



// A[] = {48, 2, 50, 12, -24, 5, 5}
// Output is 1



// Input: A[] = {1, 2, 3}
// Output: -1 


/**
 * Test1
 */
// public class Test1 {

//     public static void main(String[] args) {
//         int A[] = {48, 2, 50, 12, -24, 5, 5};
//         int len = A.length;
//         System.out.println(middleIndex(A, len));
//     }

//     static int middleIndex(int[] A, int len){
//         int arr[] = new int[len];
//         for(int i=0; i<len; i++){
//             if(i==0)
//             arr[i] = A[i];
//             else arr[i] = A[i]+arr[i-1];
//         }
//         int tempSum = arr[len-1];
//         for(int i=0; i<len; i++){
//             tempSum = tempSum - A[i];
//             int tempSum2 = arr[i+1];
//             if(tempSum==tempSum2){
//                 return i+1;
//             }
//         }
//         return -1;
//     }
// }












// class A
// {
// static void methodOne()
// {
// System.out.println("AAA");
// }
// }


// class B extends A
// {
// static void methodOne()
// {
// System.out.println("BBB");
// }
// }


// public class MainClass
// {
// public static void main(String[] args)
// {
// A a = new B();  //B
// a.methodOne();
// }
// }



// AAABBB


// public class X
// {
// public static void main(String[] args)
// {
// String str1 = "Java";
// String str2 = str1.intern();
// String str3 = new String("Java");
// System.out.println(str1 == str2);   //true
// System.out.println(str2 == str3); // false
// System.out.println(str3 == str1);  //false
// }
// }








// ArrayList<Integer> list = new ArrayList<>();

//  list.add(1);
//  list.add(2);
//  list.add(3);
//  list.add(4);
//  list.add(5);

//  Iterator<Integer> it = list.iterator();
//  while (it.hasNext()) {
//  Integer value = it.next();
//  System.out.println("List Value:" + value);
//  if (value.equals(3))
//  list.remove(value);
//  }  
// List Value: 1
// List Value: 2
// List Value: 3
// List Value: 5


// Int hash  //108
// K key  
// V Value 
// Node next  //Shubhi  → next null

// map.put(“Shubham”, 26)   // 108
// Index 6


// map.put(“Shubhi”, 27)  //108
// Index 6


// map.get(“Shubh”)  //108
// Index 6


// Concurrent HAshmap

// Java 8 features

// List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

// //15, 98  //frequency
// Set<Integer> set = myList.stream().filter(i-> Collections.frequency(myList, i)>1).collect(Collectors.toSet());

// Return set;




// Find an Index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes



// A[] = {-7, 1, 5, 2, -4, 3, 0}
// Output is 3 because A[0] + A[1] + A[2] = A[4] + A[5] + A[6]



// A[] = {48, 2, 50, 12, -24, 5, 5}
// Output is 1



// Input: A[] = {1, 2, 3}
// Output: -1 























































/**
 * Test1
 */

//  27,1 21,9 17,4 19,7 snake           11,26, 3,22 20,29 5,8 ladder
public class Test1 {

    public static void main(String[] args) {
        
    }
}


//  Game, Board, Dice, Player, Move, Snake, Ladder
// Game --> launchGame(), makeMove()
//Board --> dimension: int, ifSnakeOrLadder: boolean
//Dice --> rollValue: int
//Player --> userName: String, position: int
//Move --> start:int, end: int, getSnakeOrLadder()
//Snake --> getSnakeOrLadder()
//Ladder --> getSnakeOrLadder()



// Map<Integer, Employee>

// 100, employee1
// 100, employee2

// List<Employee> obj;

// map, Top 3 max salary, salary unique

// Map<Integer, Employee> map = obj.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.groupingBy(Employee::getId, Collectors.))


// Map<Integer, Employee> map = new HashMap<>();
// Collections.sort(obj, Collections.reverseOrder());
// obj.sort((a,b)-> a.compareTo(b));
// for(int i=0; i<3; i++){
//     map.put(obj.get(i).getId, obj.get(i));
// }
// return map;

// Employee implements Comaprable<Employee>

// public int compare(Employee e1){

// }






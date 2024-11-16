package java.FarmeWork;


import java.util.*;

public class arrayList {// create a ArrayList fuction with pararmetrized in which we iadd the new

    // elements and remoive it
    public static void arrayllist(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(23);
        list.add(34);

        list.add(2, 10);
        list1.addAll(list);
        list1.remove(1);

        list.forEach(x -> System.out.println(x));
    }

    // luikedlist in which add delete and remove the element from the list
    public static void linkedllist(LinkedList<String> str) {
        str.add("shubham");
        str.add("rahul");
        str.add("anand");
        str.addFirst("rohit");// it add the element ofthe first positiion
        str.addLast("kumar");
        str.contains("shubham");// it return true or false
        str.add(1, "adarsh");
        str.forEach(n -> System.out.println(n));
        str.clear();
        System.out.println(str);

    }

    // create a Stack and push pop operation are perform
    public static void createStack(Stack<String> st) {
        st.push("Rahul");
        st.push("Adsarsh");
        st.push("Anand");
        System.out.println(st.pop());// it returns last element of the Stack
        System.out.println(st.empty());// it returns true or False if Stack is empty then return true otherwise false
        System.out.println(st.peek());// it returns first element of the Stack
        System.out.println(st.contains("Anand"));// it returns because anand ispoped from the Stack

    }

    public static void createQueue(Queue<Integer> que) {
        que.add(1);// add the elelment from rear of the queue i.e last
        que.add(3);
        que.add(2);
        que.add(12);
        que.add(16);
        que.add(20);

        System.out.println(que.remove());// remove the element and return element it perform
        // front of the queue if que is empty then it throws exception
        System.out.println(que.offer(7));// it returns boolean value if queue is full then return the false otherwise
                                         // true
        que.poll();// it is same as remove but it return Null when que is empty
        System.out.println(que.element());// it return the element from the front of the que if que is emptyt then it
                                          // throws exception
        System.out.println(que.peek());

    }

    // operetion on set
    public static void operation(Set<Integer> s1, Set<Integer> s2) {
        // union
        Set<Integer> Union = new HashSet<>(s1);
        Union.addAll(s2);
        System.out.println(Union);
        // Intersectin
        Set<Integer> Intersection = new HashSet<>(s1);
        Intersection.retainAll(s2);
        System.out.println(Intersection);
        // diffrence
        Set<Integer> difference = new HashSet<>(s1);
        difference.removeAll(s2);
        System.out.println(difference);
    }
    //set
    public  static void set(Set<Integer>s1){
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        System.out.println(s1);
    }
    //LinkedHashSet
    public static void linkedHashSet(LinkedHashSet<Integer>l2){
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.println(l2);
    }
    //SortedSet
    public static void sortedSet(SortedSet<Integer>l1){
        l1.add(10);
        l1.add(2);
        l1.add(3);
        l1.add(1);
        l1.add(4);
        System.out.println(l1);
    }

    public static void main(String[] args) {

        
        SortedSet<Integer>l1=new TreeSet<Integer>() ;
        sortedSet(l1);
            
        }

    }



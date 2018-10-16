import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    int[] x = new int[2];
    x[0] = 1;
    x[1] = 5;

    List<Integer> arrayList = new ArrayList();  //receives any object using ArrayList
    arrayList.add(1);                           //goes to first element of the array
    arrayList.add(5);
    arrayList.add(20);

    List<Integer> numberList = new LinkedList();  //receives any object using ArrayList
    numberList.add(1);                           //goes to first element of the array
    numberList.add(5);
    numberList.add(20);
    numberList.remove(2);


    for(int i=0; i<100; i++){
      arrayList.add(9);
    }

    int result = 0;
    for(int i=0; i<Arraylist.size(); i++){
      result += arrayList.get(i);
      System.out.println((int)arrayList.get(i));
    }
    
    
  }
}

//----------------------------------------------------
//System.out.println("Hello world!");

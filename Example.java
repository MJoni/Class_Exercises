
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
public class Example{

  private String digitToString="";

  public static void main (String [] args){
    Example ex = new Example();
    ex.digestString(28); //try to break with real number [WARNING: max(int)]

  }
  public void digestString(int realNumbers){
    int [] arr = {1000000000, 1000000, 1000,100, 20};

    if(arr[0]<= realNumbers){
      System.out.println("do something");
      System.out.println(getBigDic(realNumbers));

    }else if(arr[1]<= realNumbers){
      System.out.println("case 1000000");
      System.out.println(getBigDic(realNumbers));

    }else if (arr[2]<= realNumbers){
      System.out.println("case 1000");
      System.out.println(getBigDic(realNumbers));

    }else if(arr[3]<= realNumbers){
      System.out.println("case 100");
      System.out.println(getBigDic(realNumbers));


    }else if(arr[4]<=realNumbers) {
      System.out.println("case 20");
      System.out.println(getTenthDic(realNumbers));

    }else{
      System.out.println("case 10");
      System.out.println(getNumDic(realNumbers));
    }
    printDigit();
  }

  private String getNumDic(int num){
    Map<Integer, String> numDic = new TreeMap<Integer, String>(Collections.reverseOrder());
    numDic.put(1,"one");
    numDic.put(2,"two");
    numDic.put(3,"three");
    numDic.put(4,"four");
    numDic.put(5,"five");
    numDic.put(6,"six");
    numDic.put(7,"seven");
    numDic.put(8,"eight");
    numDic.put(9,"nine");
    numDic.put(10,"ten");
    numDic.put(11,"eleven");
    numDic.put(12,"twelve");
    numDic.put(13,"twelve");
    numDic.put(14,"twelve");
    numDic.put(15,"twelve");
    numDic.put(16,"twelve");
    numDic.put(17,"twelve");
    numDic.put(18,"twelve");
    numDic.put(19,"nineteen");

    String str = mapIterator(numDic, num);
    return str;

  }
  private String getBigDic(int realNumbers){
    int temp, reminder;

    Map<Integer, String> dic = new TreeMap<Integer, String>(Collections.reverseOrder());
    dic.put(1000000000,"billion");
    dic.put(1000000,"million");
    dic.put(1000,"thousand");
    dic.put(100, "hundred");
    dic.put(10, "tenth");


    for (Map.Entry<Integer,String> entry : dic.entrySet()){
      if(realNumbers>=entry.getKey()){
        System.out.println(entry.getKey());

        temp = realNumbers/entry.getKey();
        reminder = realNumbers%entry.getKey();

        System.out.println(reminder);


        if(temp<20){
          setString(getNumDic(temp)+" "+ entry.getValue());
        }else if(temp<100){
          setString(getTenthDic(temp)+" "+ entry.getValue());
        }
        else{
          setString(getBigDic(temp)+" "+ entry.getValue());
        }

        if(reminder<20){
          setString(getNumDic(reminder));

        }else if(reminder<100){
          setString(getTenthDic(reminder));
        }else{
          setString(getBigDic(reminder));

        }
        break;

      }

    }// end of for

    //System.out.println(digitToString);
    return "";


  }

  private String getTenthDic(int num){

    Map <Integer, String> tenthDic = new TreeMap <Integer,String>(Collections.reverseOrder());

    tenthDic.put(20,"twenty");
    tenthDic.put(30,"thirty");
    tenthDic.put(40,"forty");
    tenthDic.put(50,"fifty");
    tenthDic.put(60,"sixty");
    tenthDic.put(70,"seventy");
    tenthDic.put(80,"eighty");
    tenthDic.put(90,"ninty");

    for (Map.Entry<Integer,String> entry : tenthDic.entrySet()){

      if(num >=entry.getKey()){
        int temp = num % entry.getKey();
        return entry.getValue()+" "+ getNumDic(temp);
      }
    }// end for

    return "";


  }
  private void setString(String str){
    digitToString +=str +" ";
  }

  public void printDigit(){
    System.out.println(digitToString);
  }
  
  private String mapIterator(Map <Integer, String>map, int num){
    for (Map.Entry<Integer,String> entry : map.entrySet()){
      if(num == entry.getKey()){
        return entry.getValue();
      }
    }
    return "";
  }
}

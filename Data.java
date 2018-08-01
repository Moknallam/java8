import java.util.*;
import java.util.stream.Collectors;

class Data{
  final String name;
  final int age;
  final String color;
  final String gender;

  Data(String name, int age, String color, String gender){
  	this.name=name;
  	this.age=age;
  	this.color=color;
  	this.gender =gender;
  }
   int getAge(){
	   return this.age;
   }
  String getName(){
	   return this.name;
  }


   public String toString(){
	  return "Name : " +this.name+" Age : "+age+" Color : "+color+" Gender : " +gender;
  }

  public static List<Data> getData(){
  	List<Data> data = new ArrayList<Data>();
  	data.add(new Data("phani",36,"black","male"));
  	data.add(new Data("amrutha",30,"brown","female"));
  	data.add(new Data("mokshitha",6,"white","female"));
  	return data;
  }

  public static void main(String arg[]){
	  List<Data> ls = Data.getData().stream().filter((k) -> k.getAge()>=1).collect(Collectors.toList());

	// ls.forEach(System.out::println);
	 List<String> names = Data.getData().stream().filter((k) -> {System.out.println(k);return k.getAge()>=30;}).map(k-> {System.out.println("---Map--- :"+k);return k.getName();}).collect(Collectors.toList());

	 names.forEach(System.out::println);
  }
}
import java.util.*;

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
	   return age;
   }

  public static List<Data> getData(){
  	List<Data> data = new ArrayList<Data>();
  	data.add(new Data("phani",36,"black","male"));
  	data.add(new Data("amrutha",30,"brown","female"));
  	data.add(new Data("mokshitha",6,"white","female"));
  	return data;
  }

  public static void main(String arg[]){
	  List<Data> ls = Data.getData().filter(Data::age->age>=10);
  }
}
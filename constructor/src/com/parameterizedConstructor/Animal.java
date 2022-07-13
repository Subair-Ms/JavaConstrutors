
  package com.parameterizedConstructor;
  
  public class Animal {
  
  String animal; 
  String type;
  
  Animal(String AnimalName,String AnimalType ){
  
  animal=AnimalName; 
  type=AnimalType;
  }
  
  public void aboutAnimal() {
  System.out.println("Animal name is "+animal+" and the type is "+type);
  
  }
  
  public static void main(String[]args) { Animal animal1=new Animal("Peacock",
  "Bird");
  Animal animal2 =new Animal("Dog","Omnivorous");
  animal1.aboutAnimal(); 
  animal2.aboutAnimal(); } }
 

/*
 * package com.parameterizedConstructor;
 * 
 * public class Animal {
 * 
 * int animal; String type; 
 * //no arugumnt user defined construcutor 
 * 
 * Animal(){
 * System.out.println("Construtor is created ");
 * 
 * } 
 * public static void main(String[]args) { 
 * Animal animal=new Animal();
 * System.out.println(animal.animal);
 * 
 * } 
 * }
 */
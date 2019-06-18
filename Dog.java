/**  Sets dog name and breed of dog and updates dog weight (g) after eating and age (years) after a birthday 
 */


public class Dog {
	String name;
	String breed;
	int age;
	double weight;
	
	
public Dog(String dogName, String dogBreed) {
		 name = dogName;
		 breed = dogBreed;
		 weight=125;
		 age=0;}
				 
/*  returns the dog name
 */

public String getName() {
	return name;
}

/*  returns the dog breed
 */
public String getBreed() {
	return breed;
}

/*  returns the dog age in years
 */

public int getAge() {
	return age;
}

/*  returns the dog weight in g
 */

public double getWeight() {
	return weight;
}
/*  increases the weight of the dog by 0.1 g
 */
public void eat() {
	weight=weight+0.1;
}
/* changes the name of
the dog to the new name
@param newName is the new dog name */

public void rename(String newName) {
	
name=newName;}

/* prints out ”happy birthday” and increments the age of the dog by 1*/
public void hasBirthday() {
	age=age+1;
	System.out.println("happy birthday");} 

public static void main(String[] args) {
	Dog myDog = new Dog("Storm", "Yorkie");
	
	System.out.println(myDog.name);
	System.out.println(myDog.breed);
	System.out.println(myDog.weight);
	System.out.println(myDog.age);
	
	myDog.hasBirthday();
	myDog.eat();
	myDog.eat();
	myDog.eat();
	myDog.eat();
	myDog.hasBirthday();

	System.out.println(myDog.weight);
	System.out.println(myDog.age);
}}


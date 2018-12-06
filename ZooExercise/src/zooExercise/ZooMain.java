package zooExercise;

import java.util.ArrayList;

public class ZooMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Black", "Furry", "Cat","Tibbles", "House Cat", "Female",7,4);
		Cat cat2 = new Cat("Golden", "Furry", "Cat","Pooh", "African Golden Cat", "Male",4,2);
		Bat bat1 = new Bat(160, "Furry", "Bat", "Dracula", "Egyption fruit bat", "Male",3,1);
		Bat bat2 = new Bat(130, "Furry", "Bat", "Dodo", "Egyption fruit bat", "Male",4,5);
		Bat bat3 = new Bat(155, "Furry", "Bat", "drippy", "Indian flying fox", "Female",6,4);
		Dog dog1 = new Dog("Small", "Furry", "Dog", "Milo", "Husky", "Male",10,2);
		Dog dog2 = new Dog("Large", "Furry", "Dog", "Mickey", "Rottweiler", "Male", 50,5);
		Owl owl1 = new Owl("White Fluffy feathered", 53, "Bird", "blobby", "Owl", "Male",5,5);
		Parrot parrot1 = new Parrot("colourful short-feathered", 40, "Bird", "bratty", "Parrot", "Male",3,5);
		Eagle eagle1 = new Eagle("black stiff-feathered", 65, "Bird", "twitch", "Eagle", "Male",6,3);

		ArrayList<Animals> zoo = new ArrayList<Animals>();
		
		zoo.add(cat1);
		zoo.add(cat2);
		zoo.add(bat1);
		zoo.add(bat2);
		zoo.add(bat3);
		zoo.add(dog1);
		zoo.add(dog2);
		zoo.add(owl1);
		zoo.add(parrot1);
		zoo.add(eagle1);		
		System.out.println("Roll Call!");

		for(Animals a : zoo) {
			System.out.println(a);
		}

	}

}


package java_study;

import static java.lang.System.out;
import java.util.ArrayList;


public class MyClass{
        public static void main(String[] args){
                      out.println("hello java!!!");
                      out.println("hello git!!!");

Dog dog_1 = new Dog();
dog_1.setName("coco");
dog_1.introduce();


Dog dog_2 = new Dog();
dog_2.setName("cookie");
dog_2.introduce();

Dog dog_3 = new Dog();
dog_3.setName("loco");
dog_3.introduce();

Cat cat_1 = new Cat();
cat_1.setName("bobo");
cat_1.introduce();

Cat cat_2 = new Cat();
cat_2.setName("nana");
cat_2.introduce();

Dog dog_4 = new Dog();
dog_4.setName("Heedong");
dog_4.introduce();

ArrayList<Dog> dog_list = new ArrayList<Dog>();
dog_list.add(dog_1);
dog_list.add(dog_2);
dog_list.add(dog_3);

for(int i=0; i<dog_list.size(); i++) {
	dog_list.get(i).introduce();
}

}




}



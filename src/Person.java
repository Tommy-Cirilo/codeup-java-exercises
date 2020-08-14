/*Object basics

Create Person class inside of src that has a private name property that is a string, and the following methods:*/

/*The class should have a constructor that accepts a `String` value and sets
the person's name to the passed string.*/

public class Person {
    public static void main(String[] args) {

        /*Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);*/

        /*Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);*/

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

    public Person(String name) {
        System.out.println(name);
    }

    private String name;

    /*Create a `main` method on the class that creates a new `Person` object and
    tests the above methods.*/
        public String getName(){
//TODO: return the person's name
                return name;
        }

        public void setName(String name){
//TODO: change the name property to the passed value
            this.name = name;
        }
        public void sayHello(){
//TODO: print a message to the console using the person's name
            System.out.println(name);
        }


    }



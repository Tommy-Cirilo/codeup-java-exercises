/*Object basics

Create Person class inside of src that has a private name property that is a string, and the following methods:*/

/*The class should have a constructor that accepts a `String` value and sets
the person's name to the passed string.*/

public class Person {
    public Person() {
        System.out.println("A Person is being created!");
    }
    public static void main(String[] args) {


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



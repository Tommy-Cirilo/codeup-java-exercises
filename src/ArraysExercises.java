import java.util.Arrays;

/*Create a static method named addPerson. It should accept an array of Person
    objects, as well as a single person object to add to the passed array. It
    should return an array whose length is 1 greater than the passed array, with
    the passed person object at the end of the array.*/

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // Create an array that holds 3 Person objects
        // Person p1 = new Person("maximilian");
        // Person p2 = new Person("quixote");
        // Person p3 = new Person("wallendorf");

        Person[] people = new Person[3];
        people[0] = new Person("maximilian");
        people[1] = new Person("quixote");
        people[2] = new Person("wallendorf");

        for (Person thisPerson : people) {
            System.out.println(thisPerson.getName());
        }
        System.out.println("Adding a new person...");

        Person casey = new Person("Casey");

        Person[] updatedPeople = new Person[people.length + 1];
        updatedPeople = addPerson(people, casey);

        System.out.println("Printing out updated people array...");
        for (Person thisPerson : updatedPeople) {
            System.out.println(thisPerson.getName());
        }
    }


    /*Create an array that holds 3 Person objects. Assign a new instance of
    the Person class to each element. Iterate through the array and print out the
    name of each person in the array.*/

    public static Person[] addPerson(Person[] exsistingPeople, Person newPeep) {
        // add newPeep to the existing people
        // Using a loop (manual and tedious and boring)
        // Person[] updatedPeeps = new Person[exsistingPeople.length + 1];
        // for(int i=0; i < exsistingPeople.length; i++) {
        //     updatedPeeps[i] = exsistingPeople[i];
        // }
        // Using the copy method (fun, fun, fun!)
        Person[] updatedPeeps = Arrays.copyOf(exsistingPeople, exsistingPeople.length + 1);

        // [1, 2, 3 ] ==> [1, 2, 3, 4]  / we want to add to '4', updatePeeps[4]
        updatedPeeps[exsistingPeople.length] = newPeep;

        // return the newly crafted array with all the peeps inside of it
        return updatedPeeps;
    }
}




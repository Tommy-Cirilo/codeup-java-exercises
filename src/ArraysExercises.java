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



    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }






    class Solution {
        public String countAndSay(int n) {

            LinkedList<Integer> prevSeq = new LinkedList<Integer>();
            prevSeq.add(1);
            // Using -1 as the delimiter
            prevSeq.add(-1);

            List<Integer> finalSeq = this.nextSequence(n, prevSeq);
            StringBuffer seqStr = new StringBuffer();
            for (Integer digit : finalSeq) {
                seqStr.append(String.valueOf(digit));
            }
            return seqStr.toString();
        }

        protected LinkedList<Integer> nextSequence(int n, LinkedList<Integer> prevSeq) {
            if (n <= 1) {
                // remove the delimiter before return
                prevSeq.pollLast();
                return prevSeq;
            }

            LinkedList<Integer> nextSeq = new LinkedList<Integer>();
            Integer prevDigit = null;
            Integer digitCnt = 0;
            for (Integer digit : prevSeq) {
                if (prevDigit == null) {
                    prevDigit = digit;
                    digitCnt += 1;
                } else if (digit == prevDigit) {
                    // in the middle of the sub-sequence
                    digitCnt += 1;
                } else {
                    // end of a sub-sequence
                    nextSeq.add(digitCnt);
                    nextSeq.add(prevDigit);
                    // reset for the next sub-sequence
                    prevDigit = digit;
                    digitCnt = 1;
                }
            }

            // add the delimiter for the next recursion
            nextSeq.add(-1);
            return this.nextSequence(n - 1, nextSeq);
        }
    }

}




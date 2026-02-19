import java.util.Scanner;

/**
 * Lecture 6: Control Flow - Code Examples
 * Topics covered: if-else statements, logical operators, switch statements, 
 * for loops, foreach loops, while loops, do-while loops, nested loops
 */
public class Lecture6Examples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("===== LECTURE 6: CONTROL FLOW EXAMPLES =====\n");
        
        // Uncomment the example you want to run:
        
        // ifStatementExamples();
        // conditionExamples();
        // multipleIfsExample();
        // ifElseIfElseExamples();
        // stringComparisonExamples();
        // logicalOperatorsExamples();
        // switchStatementExamples();
        // incrementDecrementExamples();
        // forLoopExamples();
        // foreachLoopExample();
        // whileLoopExamples();
        // doWhileLoopExample();
        // breakExamples();
        // nestedLoopExample();
        // methodExamples();
        
        scan.close();
    }
    
    // ===== IF STATEMENT EXAMPLES =====
    public static void ifStatementExamples() {
        System.out.println("--- If Statement Examples ---");
        
        //Basic if statement
        int score = 95;
        if (score >= 90) {
            System.out.println("Great job!");
        }
        
        // If with comparison operators
        if (score >= 90) {
            System.out.println("Excellent!");
        }
        if (score >= 70) {
            System.out.println("Good job!");
        }
        if (score < 70) {
            System.out.println("Try again!");
        }
        System.out.println();
    }
    
    // ===== CONDITION EXAMPLES =====
    public static void conditionExamples() {
        System.out.println("--- Condition Examples ---");
        
        // Different comparison operators
        int score = 90;
        
        // Print "Great job!" if score is >= 90
        if (score >= 90) {
            System.out.println("Great job!");
        }
        
        // Examples with different operators
        if (score != 0) {
            System.out.println("Well, you got some points!");
        }
        
        String message = "F";
        if (message.equals("F")) {
            System.out.println("Try again!");
        }
        
        int testResult = 100;
        if (testResult == 100) {
            System.out.println("Wow, you got it all!");
        }
        System.out.println();
    }
    
    // ===== MULTIPLE IFS EXAMPLE =====
    public static void multipleIfsExample() {
        System.out.println("--- Multiple Ifs (can get messy) ---");
        
        int score = 95;
        
        // Multiple independent if statements - both execute!
        if (score >= 90) {
            System.out.println("Excellent!");
        }
        if (score >= 70) {
            System.out.println("Good effort.");
        }
        if (score < 70) {
            System.out.println("Keep trying!");
        }
        System.out.println();
    }
    
    // ===== IF-ELSE-IF-ELSE EXAMPLES =====
    public static void ifElseIfElseExamples() {
        System.out.println("--- If-Else-If-Else Examples ---");
        
        // Example 1: Score evaluation
        int score = 80;
        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 70) {
            System.out.println("Good effort.");  // Only this executes
        } else {
            System.out.println("Keep trying!");
        }
        
        System.out.println();
        
        // Example 2: Age categories
        int age = 33;
        if (age < 20) {
            System.out.println("You are a teenager");
        } else if (age < 30) {
            System.out.println("You are in your twenties");
        } else if (age < 40) {
            System.out.println("You are in your thirties");  // This executes
        } else {
            System.out.println("You are older than 39");
        }
        System.out.println();
    }
    
    // ===== STRING COMPARISON EXAMPLES =====
    public static void stringComparisonExamples() {
        System.out.println("--- String Comparison Examples ---");
        
        // Using .equals() for String comparison
        String name = "CS";
        if (name.equals("CS")) {
            System.out.println("Computer Science");
        }
        
        // Case-insensitive comparison
        String answer = "Computer Science";
        String guess = "cOmPuTEr SCiEncE";
        if (guess.equalsIgnoreCase(answer)) {
            System.out.println("You got it!");
        }
        System.out.println();
    }
    
    // ===== LOGICAL OPERATORS EXAMPLES =====
    public static void logicalOperatorsExamples() {
        System.out.println("--- Logical Operators Examples ---");
        
        // AND (&&) operator
        boolean isLoggedIn = true;
        boolean isAdmin = true;
        if (isLoggedIn && isAdmin) {
            System.out.println("Welcome admin!");
        } else {
            System.out.println("You shall not pass.");
        }
        
        // OR (||) operator
        boolean isModerator = false;
        if (isAdmin || isModerator) {
            System.out.println("Welcome!");
        } else {
            System.out.println("You shall not pass.");
        }
        
        // NOT (!) operator
        isLoggedIn = false;
        if (!isLoggedIn) {
            System.out.println("You need to log in!");
        } else {
            System.out.println("You are logged in, continue!");
        }
        
        // Complex logical expression
        int score = 90;
        boolean isAttending = false;
        if (score > 80 && isAttending) {
            System.out.println("Excellent work!");
        } else if (score > 80 && !isAttending) {
            System.out.println("Good work, but attendance is important.");
        } else if (score <= 80 && isAttending) {
            System.out.println("You need to work harder.");
        } else {
            System.out.println("You need to work harder and attend classes.");
        }
        System.out.println();
    }
    
    // ===== SWITCH STATEMENT EXAMPLES =====
    public static void switchStatementExamples() {
        System.out.println("--- Switch Statement Examples ---");
        
        // Basic switch example
        char direction = 'N';
        switch (direction) {
            case 'E':
                System.out.println("We are headed east.");
                break;
            case 'S':
                System.out.println("We are headed south.");
                break;
            case 'W':
                System.out.println("We are headed west.");
                break;
            case 'N':
                System.out.println("We are headed north.");
                break;
            default:
                System.out.println("We are lost.");
        }
        
        // Switch with multiple cases (fall-through)
        direction = 'E';
        switch (direction) {
            case 'E':
            case 'W':
                System.out.println("We are headed east or west.");
                break;
            case 'S':
            case 'N':
                System.out.println("We are headed south or north.");
                break;
            default:
                System.out.println("We are lost.");
        }
        System.out.println();
    }
    
    // ===== INCREMENT/DECREMENT EXAMPLES =====
    public static void incrementDecrementExamples() {
        System.out.println("--- Increment/Decrement Examples ---");
        
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("x++ = " + x++);  // Prints 5, then increments
        System.out.println("x = " + x);      // Now x is 6
        
        x = 5;
        System.out.println("\nx = " + x);
        System.out.println("++x = " + ++x);  // Increments first, then prints 6
        System.out.println("x = " + x);      // x is still 6
        
        // Compound assignment operators
        int counter = 0;
        counter += 3;  // Same as counter = counter + 3
        System.out.println("\ncounter += 3: " + counter);
        
        int score = 10;
        score -= 10;  // Same as score = score - 10
        System.out.println("score -= 10: " + score);
        System.out.println();
    }
    
    // ===== FOR LOOP EXAMPLES =====
    public static void forLoopExamples() {
        System.out.println("--- For Loop Examples ---");
        
        // Basic for loop
        System.out.println("Basic for loop (0 to 4):");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        
        // Loop through a String
        System.out.println("\nLoop through String 'Hello':");
        String word = "Hello";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        
        // Loop through an array
        System.out.println("\nLoop through array:");
        int[] num = {1, 2, 3, 4, 5};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        
        // Modifying array elements
        System.out.println("\nAdding i to each element:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Old: " + num[i]);
            num[i] += i;
            System.out.println("New: " + num[i]);
        }
        
        // Break in for loop
        System.out.println("\nFor loop with break:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 1) {
                break;  // Exits loop when i is 1
            }
        }
        System.out.println();
    }
    
    // ===== FOREACH LOOP EXAMPLE =====
    public static void foreachLoopExample() {
        System.out.println("--- Foreach Loop Example ---");
        
        String[] names = {"Ada", "Ivo", "Ti"};
        
        System.out.println("Using foreach loop:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
    
    // ===== WHILE LOOP EXAMPLES =====
    public static void whileLoopExamples() {
        System.out.println("--- While Loop Examples ---");
        
        // Basic while loop
        System.out.println("Basic while loop:");
        int counter = 1;
        while (counter < 5) {
            System.out.println(counter);
            counter = counter + 1;
        }
        
        // While loop with break
        System.out.println("\nWhile loop with break:");
        counter = 0;
        while (counter < 5) {
            System.out.println("Counter: " + counter);
            if (counter == 3) {
                break;  // Exit the loop when counter is 3
            }
            counter += 2;
        }
        
        // While loop for input validation (example structure)
        System.out.println("\nInput validation example (structure only):");
        System.out.println("// String name = \"\";");
        System.out.println("// while (name.length() == 0) {");
        System.out.println("//     System.out.println(\"Enter your name: \");");
        System.out.println("//     name = scan.next();");
        System.out.println("// }");
        
        System.out.println();
    }
    
    // ===== DO-WHILE LOOP EXAMPLE =====
    public static void doWhileLoopExample() {
        System.out.println("--- Do-While Loop Example ---");
        
        // Do-while always executes at least once
        int counter = 5;
        do {
            System.out.println("This runs at least once! Counter: " + counter);
            counter++;
        } while (counter < 3);  // Condition is false, but loop ran once
        
        System.out.println("\nDo-while for input validation (structure):");
        System.out.println("// String name = \"\";");
        System.out.println("// do {");
        System.out.println("//     System.out.println(\"Enter your full name: \");");
        System.out.println("//     name = scan.nextLine();");
        System.out.println("// } while (name.length() <= 0);");
        System.out.println();
    }
    
    // ===== BREAK EXAMPLES =====
    public static void breakExamples() {
        System.out.println("--- Break Examples ---");
        
        // Break in a for loop
        System.out.println("Break in for loop:");
        String word = "Hey";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
            if (i == 2) {
                System.out.println("!");
                break;
            }
            System.out.println("-");
        }
        System.out.println("-");
        System.out.println("y");
        System.out.println("!");
        System.out.println();
    }
    
    // ===== NESTED LOOP EXAMPLE =====
    public static void nestedLoopExample() {
        System.out.println("--- Nested Loop Example ---");
        
        // Creating a triangle pattern
        System.out.println("Triangle pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Square pattern
        System.out.println("\nSquare pattern:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // ===== METHOD EXAMPLES FROM SLIDES =====
    public static void methodExamples() {
        System.out.println("--- Method Examples ---");
        
        // Print letters example
        System.out.println("Print letters of 'Hi':");
        printLetters("Hi");
        
        // Square array example
        System.out.println("\nSquare array elements:");
        int[] arr = {2, 3, 4, 5};
        System.out.print("Original: ");
        for (int n : arr) System.out.print(n + " ");
        
        int[] squaredArr = squareArray(arr);
        System.out.print("\nSquared: ");
        for (int n : squaredArr) System.out.print(n + " ");
        
        // Longest word example
        System.out.println("\n\nFind longest word:");
        String[] words = {"Jo", "Mia", "Emma", "Tom"};
        String longest = longestWord(words);
        System.out.println("Longest word: " + longest);
        
        // Double odd, halve even example
        System.out.println("\nDouble odd, halve even:");
        int[] numbers = {23, 78, 2263, 552};
        System.out.print("Original: ");
        for (int n : numbers) System.out.print(n + " ");
        
        int[] modified = doubleOddHalveEven(numbers);
        System.out.print("\nModified: ");
        for (int n : modified) System.out.print(n + " ");
        
        // Method chaining example
        System.out.println("\n\nMethod chaining example:");
        String message = "Hello World!";
        String input = "hello world!";
        System.out.println("message.toLowerCase().equals(input): " + 
                          message.toLowerCase().equals(input));
        
        System.out.println();
    }
    
    // Helper method: Print each letter of a string
    static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    
    // Helper method: Square each element in array
    static int[] squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    
    // Helper method: Find longest word
    public static String longestWord(String[] arr) {
        String longest = "";
        for (String word : arr) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    
    // Helper method: Double odd numbers, halve even numbers
    static int[] doubleOddHalveEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] /= 2;  // Halve even numbers
            } else {
                arr[i] *= 2;  // Double odd numbers
            }
        }
        return arr;
    }
}

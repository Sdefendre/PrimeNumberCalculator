# PrimeNumberCalculator
# Assignment #3: Finding Prime Numbers

## Author

Steve Defendre

## Due Date

10/04/2023

## Description

This Java program prompts the user for a range of integers and then finds all the prime numbers within that range. 

## How to Run

1. Make sure you have Java installed on your machine.
2. Compile the `PrimeNumberFinder.java` file:
    ```bash
    javac PrimeNumberFinder.java
    ```
3. Run the compiled Java program:
    ```bash
    java PrimeNumberFinder
    ```

## How to Use

1. Run the program.
2. Enter the lower bound of the range when prompted.
3. Enter the upper bound of the range when prompted.
4. The program will then display all the prime numbers between the lower and upper bounds.
5. You will be asked if you want to continue. Enter 'y' to continue or 'n' to exit the program.

## Features

- Takes user input for the range of integers.
- Finds prime numbers within the given range.
- Allows the user to continue with a new range or exit the program.

## Function Descriptions

- `public static void main(String[] args)`: The main method that handles the program flow.
- `public static boolean isPrime(int n)`: Checks if a given number is prime.

## Limitations

- The program doesn't validate if the entered lower bound is less than or equal to the upper bound.

## Future Improvements

- Add input validation for range.
- Optimize the `isPrime` method for large numbers.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

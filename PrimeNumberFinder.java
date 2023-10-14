/*
  Assignment #3: Finding Prime Numbers
  Author: Steve Defendre
  due date: 10/04/2023
  Description: This program takes a range of integers as input from the user and
  finds all the prime numbers within that range.
*/

import java.util.Scanner;

public class PrimeNumberFinder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Main loop to repeatedly ask for a range and find primes.
    while (true) {
      // Ask the user for the range
      System.out.print("Enter the lower bound of the range: ");
      int lowerBound = scanner.nextInt();
      System.out.print("Enter the upper bound of the range: ");
      int upperBound = scanner.nextInt();
      
      System.out.printf("Computing prime numbers between %d and %d:\n", lowerBound, upperBound);
      
      int sequenceNumber = 1;
      
      // Loop through all odd integers > 1 in the given range
      for (int candidate = Math.max(2, lowerBound); candidate <= upperBound; candidate++) {
        if (isPrime(candidate)) {
          System.out.printf("%d. %d\n", sequenceNumber, candidate);
          sequenceNumber++;
        }
      }
      
      System.out.println("Do you want to continue? (y/n)");
      String response = scanner.next();
      if (response.equalsIgnoreCase("n")) {
        break;
      }
    }
    
    scanner.close();
  } //main

  /**
   * Check if a number is prime.
   * @param n The number to check.
   * @return true if the number is prime, false otherwise.
   */
  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {  // No need to go beyond sqrt(n)
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  
} //class PrimeNumberFinder

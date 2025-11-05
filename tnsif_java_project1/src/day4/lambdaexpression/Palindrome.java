//Program to define generic functional interface Palindrome

package day4.lambdaexpression;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}

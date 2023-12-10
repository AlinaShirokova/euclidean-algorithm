# Euclidean algorithm

In mathematics, the Euclidean algorithm is an efficient method for computing the greatest common divisor (GCD) of two integers (numbers), the largest number that divides them both without a remainder.
It is an example of an algorithm, a step-by-step procedure for performing a calculation according to well-defined rules, and is one of the oldest algorithms in common use.
The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number.

## Divide-and-conquer

In computer science, divide and conquer is an algorithm design paradigm. A divide-and-conquer algorithm recursively breaks down a problem into two or more sub-problems of the same or related type, until these become simple enough to be solved directly. The solutions to the sub-problems are then combined to give a solution to the original problem. 

### Greatest common divisor

The Euclidean algorithm calculates the greatest common divisor (GCD) of two natural numbers a and b. 
The greatest common divisor g is the largest natural number that divides both a and b without leaving a remainder. 
Synonyms for GCD include greatest common factor (GCF), highest common factor (HCF), highest common divisor (HCD), and greatest common measure (GCM). 
The greatest common divisor is often written as gcd(a, b)

#### Subtraction-based animation of the Euclidean algorithm

![Euclidean_algorithm_1071_462](https://github.com/AlinaShirokova/euclidean-algorithm/assets/43037374/16eff271-eff3-48ae-aa55-67db44fd8e65)

## The Algorithm

The Euclidean Algorithm for finding GCD(A,B) is as follows:

1) If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.  
2) If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.  
3) Write A in quotient remainder form (A = B⋅Q + R)
4) Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)

## Worked example

For illustration, the Euclidean algorithm can be used to find the greatest common divisor of a = 1071 and b = 462. To begin, multiples of 462 are subtracted from 1071 until the remainder is less than 462. 
Two such multiples can be subtracted (q0 = 2), leaving a remainder of 147:

    1071 = 2 × 462 + 147.

Then multiples of 147 are subtracted from 462 until the remainder is less than 147. Three multiples can be subtracted (q1 = 3), leaving a remainder of 21:

    462 = 3 × 147 + 21.

Then multiples of 21 are subtracted from 147 until the remainder is less than 21. Seven multiples can be subtracted (q2 = 7), leaving no remainder:

    147 = 7 × 21 + 0.

Since the last remainder is zero, the algorithm ends with 21 as the greatest common divisor of 1071 and 462. This agrees with the gcd(1071, 462) found by prime factorization above. In tabular form, the steps are:
 	 	
| Step k  | Equation | Quotient and remainder |
| ------------- | ------------- | ------------- |
| 0  | 1071 = q0 462 + r0  | q0 = 2 and r0 = 147  |
| 1  | 462 = q1 147 + r1  | q1 = 3 and r1 = 21  |
| 2  | 147 = q2 21 + r2  | q2 = 7 and r2 = 0; algorithm ends  |

#### Sources:
1) Wikipedia - https://en.wikipedia.org/wiki/Euclidean_algorithm
2) Wikipedia - https://en.wikipedia.org/wiki/Divide-and-conquer_algorithm
3) Khanacademy - https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm

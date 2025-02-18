1.reverse right half pyramid

for(int i = 0; i<5; i++){
  for(int j = i; j<5; j++){
    System.out.print(" * ");
  }
  System.out.println();
  }

Output: -

* * * * *
*⁠ ⁠* * *
*⁠ ⁠* *
* ⁠*
*

// Time Complexity: O(n.n) => O(n2)
// Space Complexity: O(1)

---------------------------------------------

  2. Square
  
for(int i = 0; i < 5; i++){
  for(int j = 0; j < 5; j++){
    System.out.print(" * ");
 }
    System.out.println();
}

Output: -

* ⁠* * * *
* ⁠* * * *
* ⁠* * * *
* ⁠* * * *
* ⁠* * * *

// Time Complexity: O(n.n) => O(n2)
// Space Complexity: O(1)

---------------------------------------------

3.Right half pyramid 
  
public class Main {
public static void main(String[] args) {
  for(int i = 0; i < 5; i++){ // n
    for(int j = 0; j < i; j++){ // n
      System.out.print(" * ");
    }
    System.out.println();
    }
  }
}

// Time Complexity: O(n.n) => O(n2)
// Space Complexity: O(1)

*
* ⁠*
* ⁠* *
* ⁠* * *
* * * * *
  
---------------------------------------------

4.Left Half pyramid
  
public class Main {
public static void main(String[] args) {
// Method 1

int n = 5;
 for(int i=0;i<n;i++){
  for(int j=0;j<n;j++){
    if( i+j > n/2+1 )
     System.out.print("*") ;
    else
     System.out.print(" ") ;
     }
    System.out.println();
  }
// Time Complexity: O(n.n) => O(n2)
// Space Complexity: O(1)

// Method 2

  for(int i = 0; i < 5; i++){ // n
    for(int j = i; j < 5; j++){ // n
      System.out.print(" ");
      }
    for(int j = 0; j < i; j++){ // n
      System.out.print("*");
    }
  System.out.println();
  }

// Time Complexity: O(n.n) => O(n2)
// Space Complexity: O(1)

Output: -

        *
      * *
    * * *
  * * * *
* * * * *

---------------------------------------------

5 . Triangle 
  
public class Main {
public static void main(String[] args) {
// Method 1

int n = 5;
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if( i+j > n/2+1 )
        System.out.print(" *") ;
      else
        System.out.print(" ") ;
      }
      System.out.println();
    }

// Time Complexity: O(n.n) => O(n2)
// Space Complexity: O(1)

// Method 2

    for(int i = 0; i < 5; i++){ // n
      for(int j = i; j < 5; j++){ // n
        System.out.print(" ");
        }
      for(int j = 0; j < i; j++){ // n
        System.out.print(" *");
        }
      System.out.println();
    }

// Time Complexity: O(n.n) => O(n2)
// Space Complexity: O(1)

Output: -

          *
        *  *
      *  *  *
    *  *  *  *
  *  *  *  *  *
  
---------------------------------------------

  6 . Reversed left half pyramid 
  
    for(int i = 0; i < 5; i++){ // n
      for(int j = 0; j < i; j++){ // n
        System.out.print(" ");
      }
      for(int j = i; j < 5; j++){ // n
        System.out.print("*");
    }
      System.out.println();            
  }

Output: -
* * * * *
  * * * *
    * * *
      * *
        *
---------------------------------------------
  
7. right side Triangle
  
for(int i = 0; i < 5; i++){
    for(int j = i; j < 5; j++){
    System.out.print(" ");
    }
    for(int j = 0; j < i; j++){
    System.out.print(" *");
    }
    System.out.println();
  }

for(int i = 0; i < 5; i++){
   for(int j = 0; j < i; j++){      
    System.out.print(" ");
    }
    for(int j = i; j < 5; j++){
    System.out.print(" *");
    }
  System.out.println();
  }

// Time Complexity: O(n.n) + O(n.n) => O(n2)
// Space Complexity: O(1)

Output: -

*
•⁠ *
•⁠ ⁠* *
•⁠ ⁠* * *
•⁠ ⁠* * * *
•⁠ ⁠* * *
•⁠ ⁠* *
•⁠ ⁠*
*

---------------------------------------------
8. Hollow Triangle Pattern
  
public class Main {
public static void main(String[] args) {
int n = 6;

  for(int i = 1; i <= n; i++){
    for(int j = i; j < n; j++){
    System.out.print(" ");
  }

    int x = 2 * i - 1;

    for(int j = 1; j <= x; j++){
      if(j == 1 || j == x || i == n){
      System.out.print("*");
      }else{
      System.out.print(" ");
    }
  }
    System.out.println();
  }

// Time Complexity: O(n).O(n) => O(n2)
// Space Complexity: O(1)
}
}

Output: -

          *
        *  *
      *     *
    *        *
  *  *  *  *  *
---------------------------------------------
9.Hollow Hourless pattern
  
public class Main {
public static void main(String[] args) {
int n = 6;

  for(int i = n; i >= 1; i--){
    for(int j = n; j > i; j--){
      System.out.print(" ");
    }
      int x = 2 * i - 1;
    for(int j = x; j >= 1; j--){
      if(j == 1 || j == x || i == n){          
      System.out.print("*");
      }else{
      System.out.print(" ");
      }
    }
    System.out.println();
  }

for(int i = 2; i <= n; i++){
  for(int j = i; j < n; j++){
    System.out.print(" ");
  }
    int x = 2 * i - 1;

  for(int j = 1; j <= x; j++){
    if(j == 1 || j == x || i == n){  
      System.out.print("*");
    }else{
      System.out.print(" ");
  }
  }
    System.out.println();
  }

// Time Complexity: O(n).O(n) => O(n2)
// Space Complexity: O(1)

Output: -
* * * * * *
 *       *
  *    *
    *
  *    *
 *       *  
* * * * * *


--------------------------------------------- ̰

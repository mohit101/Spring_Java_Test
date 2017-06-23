/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.javaconcepts;

/**
 *
 * @author mohitm@bdcvit.com
 */
//Aggregation is a Part-of relationship
//Aggregation is a special form of association. 
//It is also a relationship between two classes like association,
//however its a directional association, which means it is strictly a one way association. 
//It represents a Has-A relationship.
//To maintain code re-usability. To understand this lets consider the above example again. Suppose there are two other classes College and Staff along with above two classes Student and Address. In order to maintain Student’s address, College Address and Staff’s address we don’t need to use the same code again and again. We just have to use the reference of Address class while defining each of these classes like:
//Student Has-A Address (Has-a relationship between student and address)
//College Has-A Address (Has-a relationship between college and address)
//Staff Has-A Address (Has-a relationship between staff and address)

//There are four kinds of Class relationships
//
//Association: uses a
//Ex:a Class Man uses a Class Pen
//Aggregation: has a
//Ex:a Class Man has a Class Car ( Car is still there when Man die )
//Composition: owns a
//Ex:a Class Man owns a Class Heart ( When Man die, Heart die )
//Inheritance: is a
//Ex:a Class Man is a Class Human ( Man is a Human )
//A relationship between classes of objects
//
//Inheritance>Composition>Aggregation>Association

public class StudentAggregation {
    
   int rollNum;
   String studentName;
   Address studentAddr; 
   StudentAggregation(int roll, String name, Address addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }
   public static void main(String args[]){
       Address ad = new Address(55, "Agra", "UP", "India");
       StudentAggregation obj = new StudentAggregation(123, "Chaitanya", ad);
       System.out.println(obj.rollNum);
       System.out.println(obj.studentName);
       System.out.println(obj.studentAddr.streetNum);
       System.out.println(obj.studentAddr.city);
       System.out.println(obj.studentAddr.state);
       System.out.println(obj.studentAddr.country);
   }
}
class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }
}


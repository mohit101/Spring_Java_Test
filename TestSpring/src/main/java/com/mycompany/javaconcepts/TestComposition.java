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
//Composition has a reletionship which is use for reuse the code
//Composition has achive by using instance variable that refer to Object of other class

//Example1- Car and Engine--> Engine can call in Car Class,Ex2-- Person and Hand,Foot->Hand, Foot call in Personal Class.Both depend on each other a Car can Engine, Engine need car to servive
//But in Student and Address Case, Student and Address one way relationship this is Aggregation because a Student can be address but adress can not have student
//Example Manage and Project-->project will work well if manager in good, If project goes well mangger get good salry
public class TestComposition {

    public static void main(String[] args) {

    }

    class Job {

        private String role;
        private long salary;
        private int id;

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public long getSalary() {
            return salary;
        }

        public void setSalary(long salary) {
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    class Person {

//composition has-a relationship 
        private Job job;

        public Person() {
            this.job = new Job();
            job.setSalary(1000L);
        }

        public long getSalary() {
            return job.getSalary();
        }
    }
}

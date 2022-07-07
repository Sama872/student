/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;

/**
 *
 * @author hp
 */
public class Student {
    private String name;
    private int age ;
    static int number;
    public Student (String name ){
        this.name=name;
        Student.number++;
    }
    public Student (int age ){
        this.age=age;
    }
    public void setname(){
        this.name=name;
}
    public void setage(){
        if(age>5){
            this.age=age;
        }
    }
    public String getname(){
        return this.name;
    }
    public int  getage(){
        return this.age;
    }
    public static int getnumber(){
        return Student.number;
    }
}

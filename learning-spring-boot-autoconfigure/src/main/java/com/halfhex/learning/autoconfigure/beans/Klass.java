package com.halfhex.learning.autoconfigure.beans;

import lombok.Data;

import java.util.List;

@Data
public class Klass { 
    
    List<Student> students;
    
    public void dong(){
        System.out.println(this.getStudents());
    }
    
}

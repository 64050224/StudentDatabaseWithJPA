/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stduentjpa;
import model.Student;
import model.StudentTable;
/**
 *
 * @author AreYouG
 */
public class StduentJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std = new Student(1, "witt", 3.7);
        
        StudentTable.insertStudent(std);
        
        std.setGpa(3.8);
        StudentTable.updateStudent(std);
        
        Student std2 = StudentTable.findStudentById(1);
    }
    
}

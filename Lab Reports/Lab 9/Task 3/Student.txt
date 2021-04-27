
package Lab_9_Assignment_1_Task_3;

public abstract class Student {
    String status;

    //Constructors
    public Student() {
        
    }
    
    public Student(String status) {
        this.status = status;
    }

    //Setters
    public void setStatus(String status) {
        this.status = status;
    }

    //Getters
    public String getStatus() {
        return status;
    }
    
    //Methods
    public String toString(){
        return "\n\"The Student Class\"\nStatus:\t" + status + "\n\n";
    }

    public abstract void take_exam();
}

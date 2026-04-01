package OOPS;
class Students{
    String name;
    int marks;

    void setDetails(String n ,int m){
        name = n;
        marks = m;
    }
    void checkResult(){
       if(marks > 40){
        System.out.println(name +" : Pass");
       }
       else{
        System.out.println(name +" : Fail");
       }
    }

}

public class q4 {
    public static void main(String[] args){

        Students s1 = new Students();
        s1.setDetails("Arsh", 45);
        s1.checkResult();
        Students s2 = new Students();
        s2.setDetails("arsh", 39 );
        s2.checkResult();
    }
}

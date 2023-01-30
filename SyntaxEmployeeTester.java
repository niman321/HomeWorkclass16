package Class16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee syntax=new SyntaxEmployee();
        syntax.empID="i123";
        syntax.salary=18000;




        SyntaxEmployee syntax2=new SyntaxEmployee();
        syntax2.empID="i321";
        syntax2.salary=15000;
        System.out.println(syntax.salary);
        System.out.println(syntax.empID);
        System.out.println(syntax.CEO);

    }
}

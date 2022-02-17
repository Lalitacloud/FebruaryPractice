import java.util.Scanner;
class President{
    String presidentName;
    public President(String presidentName)
    {
        this.presidentName = presidentName;
    }
    public void showPresidentdet(){
        System.out.println("President's name is: "+this.presidentName);
    }
}
class Manager {
    String managername;
    String dept;
    public Manager(String managername,String dept){
        this.managername = managername;
        this.dept = dept;
    }

    void showManagerdet(){
        System.out.print("Manager in  "+this.dept );
        System.out.println(" Is : "+this.managername );
    }
}
class Employees extends Manager{
    String EmployeeName;
    String dept;
    public Employees (String EmployeeName,String dept){
        super(EmployeeName,dept);
        this.EmployeeName = EmployeeName;
        this.dept = dept;
    }
    void Employeedet(){
        System.out.print("Employee in  "+this.dept );
        System.out.println(" Is : "+this.EmployeeName );
    }
}


public class VSoftHierarchy {
    public static void main(String[] args) {
        System.out.println("Welcome to VSoft Hierarchy");
        President p = new President("PoornaVeer");
        Manager m = new Manager("Rajashekhar", "ServiceNow");
        Manager m1 = new Manager("Umashekhar", "Java");
        Manager m2 = new Manager("Srinivas", "Staffing");
        Employees emp1 = new Employees("Raju", "ServiceNow");
        Employees emp2 = new Employees("Kumar", "Java");
        p.showPresidentdet();
        m.showManagerdet();
        m1.showManagerdet();
        m2.showManagerdet();
        emp1.Employeedet();
        emp2.Employeedet();

    }
}

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the associate id:");
//        int ass_Id=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter the associate name:");
//        String name=sc.nextLine();
//
//
//        Associate obj=new Associate();
//
//        obj.setAssociateName(name);
//
//
//        System.out.println("The associate "+obj.getAssociateName()+" work status:"+obj.getWorkStatus());
//
//    }
//}

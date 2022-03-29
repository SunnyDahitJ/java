import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


class Employeemanagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("1. Employee");
        System.out.println("2. Admin");
        System.out.println("3. Exit\n");
        int choice = sc.nextInt();

        if (choice == 1) {
            Employee e1 = new Employee();
            e1.login();
        }
        if (choice == 2) {
            Admin a1 = new Admin();
            a1.login();
        }
    }
}


class Employee_details 
{
    protected String E_id;
    public String Ename;
    protected int age;
    protected String gender;
    protected long phone_no;
    protected String marital_status;
    protected String address;
    public String designation;
    public String start_date;
    public String C_email;
    // int dept_id;
    public String Manager_name;
    public String Project_assigned;

    void getempdetails() {
        E_id = "101";
        Ename = " Sunny";
        age = 23;
        gender = "Male";
        phone_no = 98783913;
        marital_status = "Single";
        address = "bangalore";
        designation = "Developer";
        start_date = "08/08/2020";
        C_email = "sun.company@gamail.org";
        // int dept_id;
        Manager_name = "Dr. Chandra";
        Project_assigned = "Employee management system";

        System.out.println("\n===============================");
        System.out.println("Employee ID : " + E_id);
        System.out.println("Employee Name : " + Ename);
        System.out.println("Age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("phone number : " + phone_no);
        System.out.println("status : " + marital_status);
        System.out.println("Address : " + address);
        System.out.println("designation : " + designation);
        System.out.println("Start date : " + start_date);
        System.out.println("Company email : " + C_email);
        System.out.println("Manager Name : " + Manager_name);
        System.out.println("Project Assigned : " + Project_assigned);
        System.out.println("===============================\n");
    }

    // Function over loading
    void getempdetails(String E_id, String Ename, int age, String gender, long phone_no, String marital_status,
            String address, String designation, String start_date, String C_email, String Manager_name,
            String Project_assigned) {
        this.E_id = E_id;
        this.Ename = Ename;
        this.age = age;
        this.gender = gender;
        this.phone_no = phone_no;
        this.marital_status = marital_status;
        this.address = address;
        this.designation = designation;
        this.start_date = start_date;
        this.C_email = C_email;
        // int dept_id;
        this.Manager_name = Manager_name;
        this.Project_assigned = Project_assigned;

        System.out.println("\n===============================");
        System.out.println("Employee ID : " + E_id);
        System.out.println("Employee Name : " + Ename);
        System.out.println("Age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("phone number : " + phone_no);
        System.out.println("status : " + marital_status);
        System.out.println("Address : " + address);
        System.out.println("designation : " + designation);
        System.out.println("Start date : " + start_date);
        System.out.println("Company email : " + C_email);
        System.out.println("Manager Name : " + Manager_name);
        System.out.println("Project Assigned : " + Project_assigned);
        System.out.println("===============================\n");
    }

    void getempdetails( String E_id, String designation, String start_date, String C_email, String Manager_name)
            {
                this.designation = designation;
                this.start_date = start_date;
                this.C_email = C_email;
                this.Manager_name = Manager_name;
            }
}

class Employee extends Employee_details {
    private String username;
    // private String email;
    private String password;

    void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        username = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();


            if ((username.equals("Sunny") && password.equals("Freaks@120"))) 
            {
                System.out.println("\nLogged in");
                while (true) 
                {
                System.out.println("\n1. View profile");
                System.out.println("\n2. Mark attendance");
                System.out.println("\n3. Update details");
                System.out.println("\n4. Log out");
                int input = sc.nextInt();
                {
                    if (input == 1) {
                        Employee_details emp1 = new Employee_details();
                        emp1.getempdetails();
                    }
                    if( input == 2)
                    {
                        Attendance attend = new Attendance();
                        attend.mark_attendance();
                    }
                    if (input == 4) {
                        System.out.println("\nlogged out successfully!\n");
                        System.exit(0);
                    }
                }

            }
        }
    }
}

class Admin extends Employee_details {
    public String adminName;
    private String admin_password;
    // private String admin_email;

    void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("AdminName: ");
        adminName = sc.nextLine();
        System.out.println("\nAdminP+password: ");
        admin_password= sc.nextLine();

        while (true) {
            if ((adminName.equals("admin") && admin_password.equals("admin1"))) {
                System.out.println("\n Logged In Successfully");
                System.out.println("1.Add employee\n");
                System.out.println("2.Update employee details(company mail, start date, Manager name and designation only!!)\n");
                System.out.println("3.Terminate employee\n");
                System.out.println("Enter your choice\n");
                int choice = sc.nextInt();
                if (choice == 1) {
                    // int i;
                    System.out.println("\n No.of employees you want to add?\n");
                } else if (choice == 2) {
                    System.out.println("\nYou have been logged out successfully!\n");
                    // Employee_details emp2 = new Employee_details();
                    // emp2.updatedetails();
                } else if (choice == 3) {
                    // delete(); to delete a record(employee)
                } else if (choice == 4) {
                    System.out.println("\nlogged out successfully!\n");
                    System.exit(0);
                }
            }
        }
    }
}

class Department
{
    protected int dept_id;
    public String dept_name;
    protected float revenue;
    protected float expenses;

    void profit()
    {
        System.out.println("\n Net profit is : nothing right now!!");
    }


    // Anonymous Object
    // public static void main(String [] args)
    // {
    //     new Department().profit();
    // }
}

class Project extends Department
{
    int project_id;
    String project_name;
    //String dept_name;
    String start_date;
    String end_date;
    String Deadline;
    String project_head;
    String Client_name;
    
    Project()
    {
        project_id = ThreadLocalRandom.current().nextInt();
    }

    // Project(int project_id)
    // {
    //     this.project_id = project_id;
    // }
    void show_active_projects()
    {
        System.out.println("\nlist of active projects");
    }

}

class Attendance extends Employee
{
    int total_leave;
	int no_leave_taken;

    Attendance()
    {
        total_leave = 20;
    }
    void mark_attendance()
    {
     //mark_attendance(String date) date of the attendance to be marked
        System.out.println("\nAttendace updated!! for today");
    }
}

class client extends Project{
    String org_name;
	String contact_name;
	int c_phoneno;
	String email;
    float project_revenue;

    void revenue()
    {
        System.out.println("\nRevenue is!!");
    }

    void min_max()
    {
        //min  and max value project 
        System.out.println("\n MIN and MAX is!!");
    }

}

class Payroll extends Employee_details
{
    float basic_pay;
	float HRA;
	float DA;
	float pf;
	int ot;
	float gross_salary;
	float net_salary;

    Payroll(String designation)
    {
        if(designation == "Developer")
        {
            basic_pay = 15000;
            HRA = 2000;
            DA = 1000;
            pf = 2100;
        }
        else if(designation == "Manager")
        {
            basic_pay = 21000;
            HRA = 2500;
            DA = 1700;
            pf = 3500;
        }
        else
        {
            basic_pay = 12000;
            HRA = 1500;
            DA = 1100;
            pf = 1450;
        }
    }

    public Payroll() {
        System.out.println("Default constructor for payroll class");
    }

    void calculate_CTC()
    {
        System.out.println("\nthe CTC is!!");
    }
 // Anonymous Class Extending a Class

        Payroll p1 = new Payroll()
        {
            void calculate_CTC()
            {
                System.out.println("\n This is the Default CTC!! from Anonomus class");
            }
        };
        Employee_details emp3 = new Employee_details()
        {
            void getempdetails()
            {
                System.out.println("Employee Name : " + Ename);
                System.out.println("Age : " + age);
                System.out.println("gender : " + gender);
                System.out.println("phone number : " + phone_no);
                System.out.println("status : " + marital_status);
                System.out.println("Address : " + address);
            }
        };
     void funcall()
    {
        emp3.getempdetails();
        p1.calculate_CTC();
    }
}


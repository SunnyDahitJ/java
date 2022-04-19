import java.util.*;
import java.util.Scanner;

class Employeemanagement {

    public static void main(String[] args) {
        for(String argument: args)
        {
            System.out.println(argument);
        }
        Company.CompanyInner obj = new Company.CompanyInner();
        obj.info();
        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("1. Employee");
        System.out.println("2. Manager");
        System.out.println("3. Exit\n");
        System.out.printf("\n");
        obj.end();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Please enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                Employee e1 = new Employee();
                e1.login();
            }
            if (choice == 2) {
                Manager a1 = new Manager();
                a1.login();
            }
        }
    }
}

class Employee_details {
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

    {
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
    }


    void getempdetails() {
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
                //String class
        String cmail = new String();
        cmail = C_email.concat("@company.com");
        this.E_id = E_id;
        this.Ename = Ename;
        this.age = age;
        this.gender = gender;
        this.phone_no = phone_no;
        this.marital_status = marital_status;
        this.address = address;
        this.designation = designation;
        this.start_date = start_date;
        //this.C_email = C_email;
        // int dept_id;
        this.Manager_name = Manager_name;
        this.Project_assigned = Project_assigned;

        display(this.E_id, this.Ename, this.age, this.gender, this.phone_no, this.marital_status, this.address,
                this.designation, this.start_date, cmail, this.Manager_name, this.Project_assigned);

    }

    // Update details of the employee
    void update_details(String Manager_name, String designation, String C_email, String Project_assigned) {
        this.designation = designation;
        this.C_email = C_email;
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
        System.out.println("designation : " + this.designation);
        System.out.println("Start date : " + start_date);
        System.out.println("Company email : " + this.C_email);
        System.out.println("Manager Name : " + this.Manager_name);
        System.out.println("Project Assigned : " + this.Project_assigned);
        System.out.println("===============================\n");

    }

    public void display(String E_id, String Ename, int age, String gender, long phone_no, String marital_status,
            String address, String designation, String start_date, String C_email, String Manager_name,
            String Project_assigned) {
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
}

class Employee extends Employee_details {
    private String username;
    // private String email;
    private String password;
    Scanner sc = new Scanner(System.in);

    void login() {
        System.out.println("Username: ");
        username = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();

        if ((username.equals("Sunny") && password.equals("Freaks@120"))) {
            System.out.println("\nLogged in");
            while (true) {
                System.out.println("\n1. View profile");
                System.out.println("\n2. attendance");
                System.out.println("\n3. Payroll details");
                System.out.println("\n4. Log out");
                int input = sc.nextInt();
                {
                    if (input == 1) {
                        Employee_details emp1 = new Employee_details();
                        emp1.getempdetails();
                    }
                    if (input == 2) {
                        System.out.println("Enter the total days in the year: ");
                        int yr = sc.nextInt();
                        System.out.println("Enter no of present days: ");
                        int days = sc.nextInt();
                        // Attendance attend = new Attendance();
                        //static call
                        Attendance.year(yr);
                        Attendance.calculate_attandance(days);
                    }
                    if (input == 3) {
                        
                        System.out.println("1. generate pay CTC");
                        System.out.println("2. pay slip with oT");
                        String desig;
                        int choice = sc.nextInt();
                        if( choice == 1)
                        {
                            System.out.println("Designation :");
                            desig = sc.next();
                            Payroll pay = new Payroll(desig);
                            pay.calculate_CTC();
                        }
                        else if(choice == 2)
                        {

                        System.out.println("Enter the day of the week for over time completed: ");
                        String weekday = sc.next();
                        System.out.println("No of days work for OT: ");
                        int num = sc.nextInt();
                        System.out.println("Designation :");
                        desig = sc.next();
                        Payroll pay1 = new Payroll(weekday,num,desig);
                        }
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

class Manager extends Employee_details {
    public String ManagerName;
    private String Manager_password;
    // private String Manager_email;
    Scanner sc = new Scanner(System.in);

    void login() {
        System.out.println("ManagerName: ");
        ManagerName = sc.nextLine();
        System.out.println("\nA_password: ");
        Manager_password = sc.nextLine();


        if ((ManagerName.equals("Manager") && Manager_password.equals("Manager1"))) {
            System.out.println("\n Logged In Successfully");
        while (true) {          
                System.out.println("1.Add employee\n");
                System.out.println("2.Update employee details(company mail, Manager name and designation only!!)\n");
                System.out.println("3.Terminate employee\n");
                System.out.println("4.logout\n");
                // System.out.println("5.List department details");
                // System.out.println("6.Project details");
                System.out.println("Enter your choice\n");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("\n No.of employees you want to add?\n");
                    int number = sc.nextInt();
                    // Array of objects
                    Employee_details E1[] = new Employee_details[number];
                    for (int i = 0; i < number; i++) {
                        System.out.println("Enter the Employee ID : ");
                        String id = sc.next();
                        System.out.println("Enter the Employee Name : ");
                        String ename = sc.next();
                        System.out.println("Enter the  Age : ");
                        int age = sc.nextInt();
                        System.out.println("Enter the  gender : ");
                        String sex = sc.next();
                        System.out.println("Enter the phone number : ");
                        Long p_no = sc.nextLong();
                        System.out.println("Enter the status : ");
                        String status = sc.next();
                        System.out.println("Enter the Address : ");
                        String address = sc.next();
                        System.out.println("Enter the designation : ");
                        String position = sc.next();
                        System.out.println("Enter the Start date : ");
                        String begin_date = sc.next();
                        System.out.println("Enter the Company email : ");
                        String mail = sc.next();
                        System.out.println("Enter the Manager Name : ");
                        String m_name = sc.next();
                        System.out.println("Enter the project Name : ");
                        String p_name = sc.next();

                        E1[i] = new Employee_details();
                        E1[i].getempdetails(id, ename, age, sex, p_no, status, address, position, begin_date, mail,
                                m_name, p_name);
                    }

                } else if (choice == 2) {
                    System.out.println("\nYou have been logged out successfully!\n");
                    Employee_details emp2 = new Employee_details();
                    System.out.println("Enter the designation : ");
                    String position = sc.next();
                    System.out.println("Enter the Company email : ");
                    String mail = sc.next();
                    System.out.println("Enter the Manager Name : ");
                    String m_name = sc.next();
                    System.out.println("Enter the project Name : ");
                    String p_name = sc.next();
                    emp2.update_details(position, mail, m_name, p_name);
                } else if (choice == 3) {
                    // delete(); to delete a record(employee)
                    System.out.println("Employee removed");
                } else if (choice == 4) {
                    System.out.println("\nlogged out successfully!\n");
                    System.exit(0);
                }
            }
        }
    }
}

class Department extends Employee_details {
    protected int dept_id;
    public String dept_name;
    protected float revenue;
    protected float expenses;

    void profit() {
        System.out.println("\n Net profit is : nothing right now!!");
    }

    // Anonymous Object
    {
        new Department().profit();
    }
}

class Project extends Department {
    static int project_id = 10001;
    String project_name;
    // String dept_name;
    String start_date;
    String end_date;
    String Deadline;
    String project_head;
    String Client_name;

    Project() {
        project_id++;
        System.out.println("project id is " + project_id);
    }

    // Project(int project_id)
    // {
    // this.project_id = project_id;
    // }
    void show_active_projects() {
        System.out.println("\nlist of active projects");
    }

}

class Attendance extends Employee {
    static int total_leave;
    int no_leave_taken;
    // float attendance_count;
    static int total_working_days;
//static method
    static void year(int year){
        if (year  == 365)
        {
            total_leave = 20;
            total_working_days = 250;
        }
        else if(year == 366)
        {
            total_leave = 22;
            total_working_days = 257;
        }
    }
    // void mark_attendance()
    // {
    // attendance_count++;
    // //mark_attendance(String date) date of the attendance to be marked
    // System.out.println("\nAttendace updated!! for today");
    // }

    static void calculate_attandance(int no_of_days) {
        // this.no_of_days = no_of_days;
        System.out.println("Presend days " + no_of_days);
        System.out.println(total_working_days);
        // float attendance_count = ((no_of_days / total_working_days) * 100);
        float attendance_count = ((no_of_days / total_working_days));
        System.out.println("Attendance percentage: " + attendance_count);
    }
    
    static void calculate_attandance(int no_of_days, int no_leave_taken)
    {
        System.out.println("Presend days " + no_of_days);
        System.out.println("total working days "+total_working_days);
        System.out.println("leave taken "+no_leave_taken);
        // float attendance_count = (((no_of_days - no_leave_taken) / total_working_days) * 100);
        float attendance_count = (((no_of_days - no_leave_taken) / total_working_days));
        System.out.println("Attendance percentage: " + attendance_count);
    }
}

class client extends Project {
    String org_name;
    protected String client_name;
    int c_phoneno;
    protected String email;
    float project_revenue;

    Scanner sc = new Scanner(System.in);

    void getdetails() {
        System.out.println("Enter the client's orginization : ");
        org_name = sc.next();
        System.out.println("Enter the Contanct number : ");
        c_phoneno = sc.nextInt();
        System.out.println("Enter the client name: ");
        client_name = sc.next();
        System.out.println("Enter the Email : ");
        email = sc.next();
        System.out.println("Project cost: ");
        project_revenue = sc.nextFloat();

    }

    void display() {
        System.out.println("Enter the client's orginization : " + org_name);
        System.out.println("Enter the Contanct number : " + c_phoneno);
        System.out.println("Enter the client name: " + client_name);
        System.out.println("Enter the Email : " + email);
        System.out.println("Project cost: " + project_revenue);
    }

    void min_max() {
        // min and max value project
        System.out.println("\n MIN and MAX is!!");
    }

    // void update_cinfo()
    // {
    //     StringBuffer str_name = new StringBuffer();
    //     str_name = client_name.
    // }

}

class Payroll extends Employee_details {
    float basic_pay;
    float HRA;
    float DA;
    float pf;
    int ot;
    float gross_salary;
    float net_salary;


    //constructor overloading and chaining
    Payroll(String designation) {
        if (designation == "Developer") {
            basic_pay = 15000;
            HRA = (float) (basic_pay * 0.4);;
            DA = 1000;
            pf = 2100;
        } else if (designation == "Manager") {
            basic_pay = 21000;
            HRA = (float) (basic_pay * 0.5);
            DA = 1700;
            pf = 3500;
        } else {
            basic_pay = 12000;
            HRA = (float) (basic_pay * 0.3);;
            DA = 1100;
            pf = 1450;
        }

    }
    Payroll(String week_day, int no_of_days, String designation)
    {
        this(designation);
        int total_ot;
        if (week_day == "Monday" || week_day == "monday" || week_day == "Tuesday" || week_day == "tuesday" || week_day == "Wednesday" || week_day == "wednesday" ||week_day == "Thursday" || week_day == "thursday") {
           
            ot = 250;    
        } 
        else if(week_day == "Friday" || week_day == "friday" ||week_day == "Satuday" || week_day == "Saturday")
        {
            ot = 500;
        }
        total_ot = ot * no_of_days;
        calculate_salary(basic_pay,HRA,DA,pf,total_ot);

    }

    void calculate_salary(float basic_pay,float HRA,float DA,float pf,int ot)
    {
        float c_salary = 0;
        c_salary = ((basic_pay + HRA + DA + ot) - pf);
        System.out.println("Basic Pay : " + basic_pay);
        System.out.println("House rent allowance : " + HRA);
        System.out.println("Dearness Allowance : " + DA);
        System.out.println("Provident fund : " + pf);
        System.out.println("Pay for the month is: " + c_salary);

    }

    public Payroll() {
        System.out.println("Default constructor for payroll class");
    }

    void calculate_CTC() {
        float ctc = 0;
        ctc = ((basic_pay + HRA + DA) - pf) * 12;
        System.out.println("Basic Pay : " + basic_pay);
        System.out.println("House rent allowance : " + HRA);
        System.out.println("Dearness Allowance : " + DA);
        System.out.println("Provident fund : " + pf);
        System.out.println("The CTC is: " + ctc);

        Employee_details emp3 = new Employee_details() {
            void getempdetails() {
                System.out.println("Employee Name : " + Ename);
                System.out.println("Age : " + age);
                System.out.println("gender : " + gender);
                System.out.println("phone number : " + phone_no);
                System.out.println("status : " + marital_status);
                System.out.println("Address : " + address);
            }
        };
        emp3.getempdetails();
    }
    // Anonymous Class Extending a Class

    Payroll p1 = new Payroll()
    {
    void calculate_CTC()
    {
    System.out.println("\n This is the Default CTC!! from Anonomus class");
    }
    };

}

// Nested static Class
class Company {
    static final String org_name = "Google's Amazon ";
    static String stateName = "Karanataka ";
    static String cityName = "Bangalore";

    static class CompanyInner {
         void info() { 
            System.out.printf("=================================================================\n");
            System.out.printf("Company Name : "+org_name +"\n Location: "+stateName + cityName+"\n");
            System.out.printf("=================================================================\n");         
            System.out.println("About Us");
            //StringBuffer class
            StringBuilder Str = new StringBuilder();
            Str.append("Lorem ipsum dolor sit amet consectetur adipisicing elit.");
            System.out.println(Str);
            System.out.printf("=================================================================\n");  
        }
        //StringBuilder class
        void end()
        {
            StringBuffer strang = new StringBuffer("© Copyright 2011-2022 www.googlesamazon.com.");
            strang.capacity();
            strang = strang.append(" All rights reserved. Developed by Sunny.");
            System.out.println(strang);
            //System.out.println(strang.capacity());
        }

    }
}




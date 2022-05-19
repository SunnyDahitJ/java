import pack.pay;

import java.util.*;

// default method
interface Employee_details {
    default void begin()
    {
        System.out.println("Program start!");
    }
    void get_details();
    void update_details(String Manager_name, String designation, String C_email, String project_a_assigned);
}

interface Department {
    void get_data();
    void depart_display();
}

//multiple inheritance using interface
class project_a implements Employee_details, Department
{
    public String E_id;
    public String Ename;
    public int age;
    public String gender;
    public long phone_no;
    public String marital_status;
    public String address;
    public String designation;
    public String start_date;
    public String C_email;
    // int dept_id;
    public String Manager_name;
    public String project_a_assigned;

    Scanner sc = new Scanner(System.in);
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
        project_a_assigned = "Employee management system";
    }
    public void get_details() {
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
        System.out.println("project_a Assigned : " +project_a_assigned);
        System.out.println("===============================\n");
    }
    public void update_details(String Manager_name, String designation, String C_email, String project_a_assigned) {
        this.designation = designation;
        this.C_email = C_email;
        this.Manager_name = Manager_name;
        this.project_a_assigned = project_a_assigned;


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
        System.out.println("Project Assigned : " + this.project_a_assigned);
        System.out.println("===============================\n");
    }
    String dept_name;
    float revenue;
    float expenses;
    static int dept_id;
    public void get_data()
    {
        System.out.println("Enter the department name: ");
        dept_name = sc.next();
        //unchecked exception
        try {
            System.out.println("Enter the revenue generated: ");
            revenue = sc.nextFloat();
            System.out.println("Enter the total expenses: ");
            expenses = sc.nextFloat();
            
        } catch (InputMismatchException e) {
            System.out.println(e+" : Please enter float or integer input only!!!");
        }
        
        profit(revenue,expenses);
    }
    public void depart_display()
    {
        dept_id++;
        System.out.println("Department id : "+dept_id);
        System.out.println("Department name: "+dept_name);
        System.out.println("Department revenue: "+revenue);
        System.out.println("Department expences : "+expenses);
    }
    void profit(float revs,float expen)
    {
        float net_profit  = (revs - expen);
        System.out.println(" Profit of the department : "+net_profit);
    }
}

//main calss
class lab8
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        company_info.comp_Inner c1 = new comp();
        comp c2 = new comp();
        Employee_details e10 = new project_a();
        e10.begin();
        c2.info();
        
        System.out.println("Enter the designation: ");
        String design =sc.next();
        pay p1 =new pay("monday",3,design);
        
        project_a obj = new project_a();
        obj.get_details();
        obj.get_data();
        obj.depart_display();
        project_a emp2 = new project_a();
        System.out.println("Enter the designation : ");
        String position = sc.next();
        System.out.println("Enter the Company email : ");
        String mail = sc.next();
        System.out.println("Enter the Manager Name : ");
        String m_name = sc.next();
        System.out.println("Enter the project Name : ");
        String p_name = sc.next();
        emp2.update_details(position, mail, m_name, p_name);
        

        attend l1 = new logs();
        System.out.println("Enter total numebr of days in the year: ");
        //custom try block
        try {
            int num = sc.nextInt(); 
            System.out.println("total working days :"+attend.year(num));
        } catch (InvalidYearException ex) {
            System.out.println("Exception occured: " + ex);
        }
        finally {
        System.out.println("The 'try catch' is finished.");
      }
        
        c1.end();
    }
}
//custom exception
class InvalidYearException extends Exception
{
    public InvalidYearException(String  str)
    {
        super(str);
    }
    
}

//extending interface
interface attend extends Employee_details
{
    static int year(int year) throws InvalidYearException
    {
        int total_leave;
        int total_working_days =0;
        if(year > 366 || year < 364)
        {
            throw new InvalidYearException("year is not valid!");  
        }
        else
        {
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
            return total_working_days;
        }
    //void year(int year);
    }
} 

class logs implements attend
{   

    public String E_id;
    public String Ename;
    public int age;
    public String gender;
    public long phone_no;
    public String marital_status;
    public String address;
    public String designation;
    public String start_date;
    public String C_email;
    // int dept_id;
    public String Manager_name;
    public String project_a_assigned;

    Scanner sc = new Scanner(System.in);
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
        project_a_assigned = "Employee management system";
    }
    public void get_details() {
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
        System.out.println("project_a Assigned : " +project_a_assigned);
        System.out.println("===============================\n");
    }
    public void update_details(String Manager_name, String designation, String C_email, String project_a_assigned) {
        this.designation = designation;
        this.C_email = C_email;
        this.Manager_name = Manager_name;
        this.project_a_assigned = project_a_assigned;

    }


}
//nested interface
interface company_info{
    
    void info();
    interface comp_Inner{
        void end();
    }
}
class comp implements company_info.comp_Inner{
    static final String org_name = "Google's Amazon ";
    static String stateName = "Karanataka ";
    static String cityName = "Bangalore";

       public void info() { 
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
        public void end()
        {
            StringBuffer strang = new StringBuffer("© Copyright 2011-2022 www.googlesamazon.com.");
            strang.capacity();
            strang = strang.append(" All rights reserved. Developed by Sunny.");
            System.out.println(strang);
            //System.out.println(strang.capacity());
        }

}


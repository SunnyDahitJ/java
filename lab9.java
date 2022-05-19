import java.util.*;
import java.util.Iterator;
import java.util.Scanner;


class DesignNotFoundException extends Exception
{
    public DesignNotFoundException(String  str)
    {
        super(str);
    }
    
}


public class lab9 {
    static String design;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {
        try
        {
        System.out.println("Enter the designation: ");
        //sc.close();
        try{
            lab9.design = sc.next();
        }
        catch(Exception e)
        {
            System.out.println("Problem with scanner: " + e);
        }
        
        validate();
        }
        catch(DesignNotFoundException ex)
        {
            System.out.println("Exception occured: "+ex);
        }

       // payslip p1 = new payslip("monday", 3, design);

    }

    static void validate() throws DesignNotFoundException
    {
        if(!lab9.design.equals("Developer") && !lab9.design.equals("Manager"))
        {
            throw new DesignNotFoundException("designation is not valid!");  
    }
    else{
        payslip p1 = new payslip("monday", 3, lab9.design);
    }
    }
}



class payslip {
    float basic_pay;
    float HRA;
    float DA;
    float pf;
    int ot;
    float gross_salary;
    float net_salary;


    //constructor overloading and chaining
    payslip(String designation) {

        
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
    payslip(String week_day, int no_of_days, String designation)
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

}

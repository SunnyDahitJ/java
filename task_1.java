class Employee_personal_details
{
	String Ename;
	int age;
	String gender;
	int phonn_no;
	String marital_status;
	String address;
	
	void add_details();
	void update_details();
	void display();
	void search();
}

class Employee_work_details
{
	int E_id;
	String designation;
	String start_date;
	String C_email;
	int dept_id;
	String Manager_name;
	int Project_assigned;

	void add_details();
	void update_details();
	void display();
	void search();


}

class Department
{
	int dept_id;
	String D_name;
	int D_vacancy;
	int no_of_emp_dept;
	float revenue;

	void no_of_emp();
	void annual_revenue();
	void Expenses_per_project();
	
	
}

class Project
{
	String p_name;
	int project_id;
	(inherit from department)dept_name;
	(inherit from employee)int emp_id;
	int no_of_e_needed();
	String project_desc;

	void add_details();
	void assign_projects();
	
}

class Attendance
{
	(inherit from employee)int E_id;
	(inherit from employee)String ename;
	int total_leave;
	int no_available_leave;
	int no_leave_taken;

	void apply_for_leave();
	void display_leave_history();
	
}

class Payroll
{
	(inherit from employee)int E_id;
	float basic_pay;
	flaot HRA;
	float DA;
	float pf;
	int ot;
	float gross_salary;
	float net_salary;
	
	void add_details;
	void salary_details();
	void deducation();
	void display_payslip();
	
}

class vacancy
{
	(inherit from department)v_id;
	(inherit from department)String Dept_name;
	String v_title;
	String v_description;
	float salary;
	int no_of_openings;

	void add_details();
	void vacancy_history();
	void active_openings();
		
	
}

class client
{
	String org_name;
	String contact_name;
	int c_phoneno;
	String email;
	String project_name();
	String project_status();

	void add_details();
	void display();
	void search();
	void c_history();
	void find_active_client();
	
}

class IT_eqipment
{
	(inherit from employee) int e_id;
	(inherit from department)int d_id;
	(inherit from department)String d_name;
	int system_no;
	String issued_date;
	String return_date;

	void add_details();
	void display();
	void modify();
	void Search();
	void history();
}

class feedback
{
	(inherit from employee) int e_id;
	(inherit from department)int d_id;
	int f_id;
	String f_desc;
	String submit_date;
	String topic;
	
	void add_details();
	void display();
	void classify();	
}

class Complaint
{
	(inherit from employee) int e_id;
	(inherit from department)int d_id;
	int c_id;
	String c_desc;
	String submit_date;
	String topic;
	
	void add_details();
	void display();
	void classify();
	void history();	
}



	
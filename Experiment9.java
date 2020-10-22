import java.util.*;

class Employee

{

	int empId;
	long mobile;
	String name, address, mailid;
	Scanner get = new Scanner(System.in);

	void getdata() {
		System.out.println("Enter Name of the Employee");
		name = get.nextLine();
		System.out.println("Enter Mail id");
		mailid = get.nextLine();
		System.out.println("Enter Address of the Employee:");
		address = get.nextLine();
		System.out.println("Enter Employee id ");
		empId = get.nextInt();
		System.out.println("Enter Mobile Number");
		mobile = get.nextLong();
	}

	void display() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee id : " + empId);
		System.out.println("Mail id : " + mailid);
		System.out.println("Address: " + address);
		System.out.println("Mobile Number: " + mobile);
		System.out.println();
	}
}

class Programmer extends Employee {
	double bp, da, hra, pf, club, net, gross;

	void getProgrammer() {
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}

	void calculateprog() {
		da = (0.97 * bp);
		hra = (0.10 * bp);
		pf = (0.12 * bp);
		club = (0.1 * bp);
		gross = (bp + da + hra);
		net = (gross - pf - club);
		System.out.println("PAY SLIP FOR Programmer");
		System.out.println("Basic Pay:Rs" + bp);
		System.out.println("DA:Rs" + da);
		System.out.println("PF:Rs" + pf);
		System.out.println("HRA:Rs" + hra);
		System.out.println("CLUB:Rs" + club);
		System.out.println("GROSS PAY:Rs" + gross);
		System.out.println("NET PAY:Rs" + net);
	}
}

class AsstProfessor extends Employee {
	double bp, da, hra, pf, club, net, gross;

	void getasst() {
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}

	void calculateasst() {
		da = (0.97 * bp);
		hra = (0.10 * bp);
		pf = (0.12 * bp);
		club = (0.1 * bp);
		gross = (bp + da + hra);
		net = (gross - pf - club);
		System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
		System.out.println("DA:Rs" + da);
		System.out.println("HRA:Rs" + hra);
		System.out.println("PF:Rs" + pf);
		System.out.println("CLUB:Rs" + club);
		System.out.println("GROSS PAY:Rs" + gross);
		System.out.println("NET PAY:Rs" + net);
	}
}

class AssociateProfessor extends Employee {
	double bp, da, hra, pf, club, net, gross;

	void getassociate() {
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}

	void calculateassociate() {
		da = (0.97 * bp);
		hra = (0.10 * bp);
		pf = (0.12 * bp);
		club = (0.1 * bp);
		gross = (bp + da + hra);
		net = (gross - pf - club);
		System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
		System.out.println("Basic Pay:Rs" + bp);
		System.out.println("DA:Rs" + da);
		System.out.println("HRA:Rs" + hra);
		System.out.println("PF:Rs" + pf);
		System.out.println("CLUB:Rs" + club);
		System.out.println("GROSS PAY:Rs" + gross);
		System.out.println("NET PAY:Rs" + net);
	}
}

class professor extends Employee {
	double bp, da, hra, pf, club, net, gross;

	void getprofessor() {
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}

	void calculateprofessor() {
		da = (0.97 * bp);
		hra = (0.10 * bp);
		pf = (0.12 * bp);
		club = (0.1 * bp);
		gross = (bp + da + hra);
		net = (gross - pf - club);
		System.out.println("PAY SLIP FOR PROFESSOR");
		System.out.println("Basic Pay:Rs" + bp);
		System.out.println("DA:Rs" + da);
		System.out.println("HRA:Rs" + hra);
		System.out.println("PF:Rs" + pf);
		System.out.println("CLUB:Rs" + club);
		System.out.println("GROSS PAY:Rs" + gross);
	}
}

class Experiment9 {
	public static void main(String args[]) {
		int choice, cont;
		do {
			System.out.println("PAYROLL");
			System.out.println(" 1.Programmer \t 2.ASSISTANT PROFESSOR \t 3.ASSOCIATE PROFESSOR \t 4.PROFESSOR ");
			Scanner c = new Scanner(System.in);
			choice = c.nextInt();
			switch (choice)

			{
			case 1: {
				Programmer p = new Programmer();
				p.getdata();
				p.getProgrammer();
				p.display();
				p.calculateprog();
				break;
			}
			case 2: {
				AsstProfessor asst = new AsstProfessor();
				asst.getdata();
				asst.getasst();
				asst.display();
				asst.calculateasst();
				break;
			}
			case 3: {
				AssociateProfessor asso = new AssociateProfessor();
				asso.getdata();
				asso.getassociate();
				asso.display();
				asso.calculateassociate();
				break;
			}
			case 4: {
				professor prof = new professor();
				prof.getdata();
				prof.getprofessor();
				prof.display();
				prof.calculateprofessor();
				break;
			}
			}
			System.out.println("Do u want to continue 0 to quit and  1 to continue ");
			cont = c.nextInt();
		} while (cont == 1);
	}

}

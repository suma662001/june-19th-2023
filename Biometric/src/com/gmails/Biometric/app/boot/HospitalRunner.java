package com.gmails.Biometric.app.boot;

import com.gmails.Biometric.app.Doctor;
import com.gmails.Biometric.app.Hospital;
import com.gmails.Biometric.app.Nurse;
import com.gmails.Biometric.app.Patient;

public class HospitalRunner {

	public static void main(String[] args) {
      
		Hospital hospital = new Hospital();
		System.out.println(hospital.hospitalname);
	    System.out.println(hospital.location);
	    hospital.healthcare();
     	hospital.checkup();
	    Doctor doctor =hospital.doctor;
	    
	    System.out.println("---------------");
	 	System.out.println(doctor.doctorname);
	    System.out.println(doctor.salary);
	    doctor.treatment();
	    doctor.operation();
	    Nurse nurse=doctor.nurse;
	    
	    System.out.println("---------------");
	 	System.out.println(doctor.doctorname);
	    System.out.println(doctor.salary);
	    nurse.care();
	    nurse.treatment();
	    Patient patient=nurse.patient;
	    
	    System.out.println("---------------");
	 	System.out.println(patient.diseaseName);
	    System.out.println(patient.billCkeckUp);
	  	patient.recovery();
	  	patient.bedrest();
	}
	
	

}

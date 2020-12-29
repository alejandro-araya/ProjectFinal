package com.alejandroaraya.ds.chicagoanalysis;
import com.alejandroaraya.ds.chicagoanalysis.models.Worker;

public class Facts {

    private Worker[] workers;

    public Facts(Worker[] workers) {
        this.workers = workers;
//        this.getHigherPaidWorker();
        this.getHigherPaidHalfTimePosition();
//        this.getAverageSalaryForPartTimeWorkers();
        this.getDeparmentWithHigherSalary();
        this.getJobttitleAnnualSalaryAverage();
        this.getFiveHigherPaidWorkers();
        this.getDepartmentWithLessSalary();

    }
//
//    public void getHigherPaidWorker() {
//        Worker higherPaid = workers[0];
//        for (int index = 0; index < this.workers.length; ++index) {
//            if (this.workers[index].getAnnualSalary() > higherPaid.getAnnualSalary()) {
//                higherPaid = this.workers[index];
//            }
//        }
//        System.out.println("The worker who gain higher salary is ");
//        System.out.println(higherPaid.toString());
//    }
//
//    public void getHigherPaidHalfTimePosition() {
//        Worker higherPaid = null;
//        for (int index = 0; index < this.workers.length; ++index) {
//            if (this.workers[index].isPartTime() && (higherPaid == null || this.workers[index].getAnnualSalary() > higherPaid.getAnnualSalary())) {
//                higherPaid = this.workers[index];
//            }
//        }
//        System.out.println(" El empleado que trabaja medio tiempo con el salario más alto es:");
//        System.out.println(higherPaid.toString());
//    }
//
//    public void getAverageSalaryForPartTimeWorkers() {
//        int amountOfPartTimeWorkers = 0;
//        double totalPartTimeSalaries = 0.0;
//        for (Worker worker : workers) {
//            if (worker.isPartTime()) {
//                amountOfPartTimeWorkers++;
//                totalPartTimeSalaries += worker.getAnnualSalary();
//            }
//        }
//        System.out.println("El promedio salarial de los empleados de medio tiempo en la  ciudad de Chicago es: " + totalPartTimeSalaries / amountOfPartTimeWorkers);
//    }


    //1. ¿Cuál es el departamento más caro por año?

    public void getDeparmentWithHigherSalary() {
        Worker higherPaidDepartment = workers[0];
        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].getAnnualSalary() > higherPaidDepartment.getAnnualSalary()) {
                higherPaidDepartment = this.workers[index];
            }
        }
        System.out.println('\n' + "The department with higher salary per year is ");
        System.out.println(higherPaidDepartment.toString());

    }

    //2.¿ Cuáles son los 5 trabajadores que ganan más dinero por año?

    public void getFiveHigherPaidWorkers(){
        Worker higherPaid1 = workers[0]; Worker higherPaid2 = workers[0]; Worker higherPaid3 = workers[0]; Worker higherPaid4 = workers[0]; Worker higherPaid5 = workers[0];
        for(int index = 0; index < this.workers.length; ++index){
            if(this.workers[index].getAnnualSalary() > higherPaid1.getAnnualSalary()){
                higherPaid1 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid2.getAnnualSalary()){
                higherPaid2 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid3.getAnnualSalary()){
                higherPaid3 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid4.getAnnualSalary()){
                higherPaid4 = this.workers[index];
            }else if(this.workers[index].getAnnualSalary() > higherPaid5.getAnnualSalary()){
                higherPaid5 = this.workers[index];
            }
        }
        System.out.println('\n' + "The employees with higher salary are n:");
        System.out.println(higherPaid1.toString());
        System.out.println(higherPaid2.toString());
        System.out.println(higherPaid3.toString());
        System.out.println(higherPaid4.toString());
        System.out.println(higherPaid5.toString());
    }


    //3. ¿Cuál puesto gana más dinero al año en promedio?

    public void getJobttitleAnnualSalaryAverage(){
        int amountOfWorkers = 0;
        double totalAnnualSalaries = 0.0;
        for(Worker worker : workers){
            amountOfWorkers++;
            totalAnnualSalaries += worker.getAnnualSalary();
        }

        Worker higherPaidJobTitle = workers[0];
        for (int index= 0; index < this.workers.length; index++){
            if(this.workers[index].getAnnualSalary() > higherPaidJobTitle.getAnnualSalary()){
                higherPaidJobTitle = this.workers[index];
            }
        }

        System.out.println('\n' + "The average annual salary for the city of Chicago is: ");
        System.out.println(+totalAnnualSalaries/amountOfWorkers);

        System.out.println("The jobtitle with the higher salary per year is ");
        System.out.println(higherPaidJobTitle.toString());
    }

    //4. ¿Cuál puesto con jornada de medio tiempo gana más dinero al año?
    public void getHigherPaidHalfTimePosition() {
        Worker higherPaid = null;
        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].isPartTime() && (higherPaid == null || this.workers[index].getAnnualSalary() > higherPaid.getAnnualSalary())) {
                higherPaid = this.workers[index];
            }
        }
        System.out.println('\n' + " The employee who works part time  and earns more salary is:");
        System.out.println(higherPaid.toString());
    }

    //5. ¿Cuáles son los 5 departamentos con menor gasto por año?

    public void getDepartmentWithLessSalary() {

        Worker lessPaidDepartment = workers[0];
        int index1 = 0;

        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].getAnnualSalary() < lessPaidDepartment.getAnnualSalary()) {
                lessPaidDepartment = this.workers[index];
                index1 = index;
            }
        }

        Worker lessPaidDeparment2 = workers[0];
        int index2 = 0;
        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].getAnnualSalary()  < lessPaidDeparment2.getAnnualSalary() && index !=index1) {
                lessPaidDeparment2 = this.workers[index];
                index2 = index;
            }
        }
        Worker lessPaidDeparment3 = workers[0];
        int index3 = 0;
        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].getAnnualSalary()  < lessPaidDeparment3.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() != lessPaidDeparment2.getAnnualSalary()
                    && index !=index1 && index != index2 ) {
                lessPaidDeparment3 = this.workers[index];
                index3 = index;
            }
        }
        Worker lessPaidDeparment4 = workers[0];
        int index4 = 0;
        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].getAnnualSalary()  < lessPaidDeparment4.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() != lessPaidDeparment2.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() != lessPaidDeparment3.getAnnualSalary()
                    && index !=index1 && index != index2 && index !=index3) {
                lessPaidDeparment4 = this.workers[index];
                index4= index;
            }
        }
        Worker lessPaidDeparment5 = workers[0];
        int index5 = 0;
        for (int index = 0; index < this.workers.length; ++index) {
            if (this.workers[index].getAnnualSalary()  < lessPaidDeparment5.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() != lessPaidDeparment2.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() != lessPaidDeparment3.getAnnualSalary()
                    && this.workers[index].getAnnualSalary() != lessPaidDeparment4.getAnnualSalary()
                    && index !=index1 && index != index2 && index !=index3 && index !=index4) {
                lessPaidDeparment5 = this.workers[index];
                index5= index;
            }
        }


        System.out.println('\n' + "The department with less salary per year is ");
        System.out.println(lessPaidDepartment.toString());
        System.out.println(lessPaidDeparment2.toString());
        System.out.println(lessPaidDeparment3.toString());
        System.out.println(lessPaidDeparment4.toString());
        System.out.println(lessPaidDeparment5.toString());

    }



}



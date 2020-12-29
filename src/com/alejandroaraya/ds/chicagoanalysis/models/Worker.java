package com.alejandroaraya.ds.chicagoanalysis.models;

public class Worker extends Person{

    protected String jobTitle;
    protected String department;
    protected boolean isPartTime;
    protected boolean isHourly;
    protected int typicalAmountOfHours;
    protected double annualSalary;
    protected double hourlyRate;

    public Worker(final String name,
                  final String lastname,
                  final String jobTitle,
                  final String department,
                  final String isPartTime,
                  final String isHourly,
                  final String typicalAmountOfHours,
                  final String annualSalary,
                  final String hourlyRate) {

        super(name, lastname);
        this.jobTitle = jobTitle;
        this.department = department;
        this.isPartTime = this.parsePartTimeInput(isPartTime);
        this.isHourly = this.parseIsHourlyInput(isHourly);
        this.typicalAmountOfHours = this.parseTypicalAmountOfHoursInput(typicalAmountOfHours);
        this.annualSalary = this.parseAnnualSalaryInput(annualSalary);
        this.hourlyRate = this.parseHourlyRateInput(hourlyRate);
        this.computeAnnualSlaryForHourlyRate();
    }
    private void computeAnnualSlaryForHourlyRate(){
        if(this.isHourly){
            this.annualSalary =  this.typicalAmountOfHours * 52 * this.hourlyRate;
        }
    }

    private boolean parseIsHourlyInput(String isHourlyColumnData){
        // Ustedes deben implementar este método para que valide el input en texto y asignen el valor boolean correspondiente
        boolean isHourly = false;
        if (isHourlyColumnData.compareTo("Hourly") == 0){
            isHourly = true;
        }
        return isHourly;
    }

    private int parseTypicalAmountOfHoursInput(String typicalAmountOfHoursColumnData){
        // Ustedes deben implementar este método
        int typicalAmountOfHours = 0;
        if (!typicalAmountOfHoursColumnData.isEmpty()){
            try{
            typicalAmountOfHours= Integer.parseInt(typicalAmountOfHoursColumnData);
        } catch (NumberFormatException exc){
//                exc.printStackTrace();
            }//catch ends

        }//if ends
        return typicalAmountOfHours;
    }

    private double parseAnnualSalaryInput(String annualSalaryColumnData){
        // Ustedes deben implementar este método
       double annualSalaryInput = 0.0;
        if (!annualSalaryColumnData.isEmpty()){
            try{
                annualSalaryInput= Double.parseDouble(annualSalaryColumnData);
            } catch (NumberFormatException exc){
                System.out.println(annualSalaryColumnData + " is not a valid double");
//                exc.printStackTrace();
            }//catch

        }//if ends
        return annualSalaryInput;
    }

    private double parseHourlyRateInput(String hourlyRateColumnData){
        // Ustedes deben implementar este método
        double hourRateInput = 0.0;
        if (hourlyRateColumnData.compareTo(" ") != 0){
            try{
                hourRateInput= Double.parseDouble(hourlyRateColumnData);
            } catch (NumberFormatException exc){
                System.out.println(hourlyRateColumnData + " is not a valid double");
//                exc.printStackTrace();
            }//catch

        }//if ends
        return hourRateInput;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", isPartTime=" + isPartTime +
                ", isHourly=" + isHourly +
                ", typicalAmountOfHours=" + typicalAmountOfHours +
                ", annualSalary=" + annualSalary +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    private boolean parsePartTimeInput(String partTimeColumnData){
        boolean isPartTime = false;
        if (partTimeColumnData.compareTo("P") == 0){
            isPartTime = true;
        }
        return isPartTime;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public int getTypicalAmountOfHours() {
        return typicalAmountOfHours;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}//Class Worker


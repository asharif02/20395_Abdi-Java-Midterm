package company_app_design;

public abstract class EmployeeData implements Employee{

    public abstract void isFullTime(boolean isFullTime);

    public void printSlogan(){
        System.out.println("See What's Next.");
    }
}
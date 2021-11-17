package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ronak
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee delivery = system.getEmployeeDirectory().createEmployee("DeliveryGuy");
        Employee customer = system.getEmployeeDirectory().createEmployee("Ronak");
        Employee res_admin = system.getEmployeeDirectory().createEmployee("resadmin");
        
        UserAccount uo = system.getUserAccountDirectory().createUserAccount("ronak", "ronak", customer, new CustomerRole());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ub= system.getUserAccountDirectory().createUserAccount("del", "del", delivery, new DeliverManRole());
        UserAccount uc = system.getUserAccountDirectory().createUserAccount("resadmin", "resadmin", res_admin, new AdminRole());
        
        return system;
    }
    
}

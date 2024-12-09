/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.BloodBank.BloodBank ;
import Business.BloodBank.BloodBankDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.MedicalEquipments;
import Business.Enterprise.Role.EnterpriseAdminRole;
import Business.Enterprise.Role.EnterpriseBloodbank;
import Business.Enterprise.Role.EquipmentEnterpriseRole;
import Business.Enterprise.Role.LabEnterprise;
import Business.Enterprise.Role.PharmaceuticalEnterpriseAdminRole;
import Business.Enterprise.Role.VaccinationEnterpriseRole;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Products.Product;
import Business.Role.DeliveryAgentRole;
import Business.Role.DoctorRole;
import Business.Role.EquipmentProviderRole;
import Business.Role.LabAssistantRole;
import Business.Role.LabTesterRole;
import Business.Role.MarketManagerRole;
import Business.Role.PharmacistRole;
import Business.Role.SystemAdminRole;
import Business.Role.VaccinatorRole;
import Business.UserAccount.UserAccount;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class ConfigureASystem {

    public static Ecosystem configure() {

        System.out.println("CAME HERE");
        Ecosystem system = Ecosystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        Network n = system.createNetwork();
        n.setNetworkName("California");

        ArrayList<Integer> zips = n.getZipcodes();

        int[] arr = {90011, 90012, 90013, 90014, 90015};
        int[] arr2 = {02116, 02117, 2118, 2119, 02120};
//        CREATING SECOND NETWORK

        Network n2 = system.createNetwork();
        n2.setNetworkName("Boston");
        ArrayList<Integer> zips2 = n2.getZipcodes();
        for (int i : arr) {
            zips.add(i);
        }

        for (int j : arr2) {
            zips2.add(j);
        }
        
        
        
        
        
        // Add Blood Bank to the Ecosystem
        // Add Blood Bank Enterprise for California

// Ensure BloodBankDirectory exists


// Add Blood Banks to California Enterprise






     
        // Add Blood Bank Enterprise for California


   

//        CREATE MUTLIPLE CUSTOMERS AND PEOPLE
        for (int i = 1; i < 10; i++) {
            String name = "Customer" + String.valueOf(i);
            String username = "customer" + String.valueOf(i);
            String password = "customer" + String.valueOf(i);

            CustomerDirectory cdri = n.getCustomerDirectory();

            Customer myCustomer = cdri.createCustomer(name, "n@gmail.com", username, password, 90010 + i, n.getNetworkName(), "address in california", 1234567890);

            CustomerDirectory cdri2 = n2.getCustomerDirectory();
            Customer myCustomer1 = cdri2.createCustomer(name + "B", "boston@gmail.com", username + "B", password + "B", 02115 + i, n2.getNetworkName(), "address in boston", 1231231231);

        }

        String name = "Danny";
        String username = "cust";
        String password = "cust";

        CustomerDirectory cdri = n.getCustomerDirectory();
        Customer myCustomer = cdri.createCustomer(name, "pannaga3009@gmail.com", username, password, 90014, "", "addd", 1234567890);

        Employee enterpriseEmployeeAdmin = system.getEmployeeDirectory().createEmployee("enterpriseadmin");
        UserAccount ua2 = system.getUserAccountDirectory().createEnterpriseUser("enterpriseadmin", "enterpriseadmin", enterpriseEmployeeAdmin, new EnterpriseAdminRole());

        
        
   

// Add Blood Bank Enterprise for Boston

        
        
        
        
//        ONE ENTERPRISE
        EnterpriseDirectory edir = new EnterpriseDirectory();
        Enterprise e = edir.createEnterprise(Enterprise.EnterpriseType.Pharmaceutical, "Pharmaceutical", "California");
        Enterprise e1 = edir.createEnterprise(Enterprise.EnterpriseType.MedicalEquipements, "Medical Equipments", "California");
        Enterprise e2 = edir.createEnterprise(Enterprise.EnterpriseType.LabDiagnostics, "Lab Center & Diagnostics", "California");
        Enterprise e3 = edir.createEnterprise(Enterprise.EnterpriseType.Vaccination, "Immunization & Vaccination", "California");
        //Enterprise e4 = edir.createEnterprise(Enterprise.EnterpriseType.BloodBank, "California Blood bank", "California");

             Enterprise e4 = edir.createEnterprise(Enterprise.EnterpriseType.BloodBank, "California Blood Bank", "California");
if (e4 != null) {
    e4.setBloodBankDirectory(new BloodBankDirectory()); // Initialize BloodBankDirectory
    e4.setDeliveryAgentsInEnterpiselist(new ArrayList<>()); // Initialize Delivery Agent List
}





        EnterpriseDirectory edir2 = new EnterpriseDirectory();
        Enterprise eB = edir2.createEnterprise(Enterprise.EnterpriseType.Pharmaceutical, "Pharmaceutical", "Boston");
        Enterprise e1B = edir2.createEnterprise(Enterprise.EnterpriseType.MedicalEquipements, "Medical Equipments", "Boston");
        Enterprise e2B = edir2.createEnterprise(Enterprise.EnterpriseType.LabDiagnostics, "Lab Center & Diagnostics", "Boston");
        Enterprise e3B = edir2.createEnterprise(Enterprise.EnterpriseType.Vaccination, "Immunization & Vaccination", "Boston");
       Enterprise e4B = edir2.createEnterprise(Enterprise.EnterpriseType.BloodBank, "Boston Blood Bank", "Boston");
if (e4B != null) {
    e4B.setBloodBankDirectory(new BloodBankDirectory()); // Initialize BloodBankDirectory
    e4B.setDeliveryAgentsInEnterpiselist(new ArrayList<>()); // Initialize Delivery Agent List
}
        
        
        
        
        
//        CREATE ENTERPRISE USER ADMINS FOR 2 ENTERPRISES
        Employee pharmaEntemp = new Employee();
        pharmaEntemp.setName("PHARMA ENTERPRISE ADMIN CALIFORNIA");
        e.getEnterpriseUserAccountDirectory().createEnterpriseUser("pharmae", "pharmae", pharmaEntemp, new PharmaceuticalEnterpriseAdminRole());

        Employee medEqupEntEmp = new Employee();
        medEqupEntEmp.setName("MEDICAL EQUIPMENTS ENTERPRISE ADMIN CALIFORNIA");
        e1.getEnterpriseUserAccountDirectory().createEnterpriseUser("medicale", "medicale", medEqupEntEmp, new EquipmentEnterpriseRole());

        Employee labEntpEMp = new Employee();
        labEntpEMp.setName("LAB CENTER & DIAGNOSTICS ENTERPRISE ADMIN CALIFORNIA");
        e2.getEnterpriseUserAccountDirectory().createEnterpriseUser("labenterprise", "labenterprise", labEntpEMp, new LabEnterprise());

        Employee vaccineEntAdmin = new Employee();
        vaccineEntAdmin.setName("VACCINE AND IMMUNIZATION ENTERPRISE ADMIN CALIFORNIA");
        e3.getEnterpriseUserAccountDirectory().createEnterpriseUser("vaccineenterprise", "vaccineenterprise", vaccineEntAdmin, new VaccinationEnterpriseRole());
        
        Employee bloodEmployee = new Employee();
        vaccineEntAdmin.setName("Bloodbank ADMIN CALIFORNIA");
        UserAccount createEnterpriseUser = e4.getEnterpriseUserAccountDirectory().createEnterpriseUser("BloodBank", "BloodBank", bloodEmployee, new EnterpriseBloodbank());
        
        

        Employee pharmaEntemp2 = new Employee();
        pharmaEntemp.setName("PHARMA ENTERPRISE ADMIN BOSTON");
        eB.getEnterpriseUserAccountDirectory().createEnterpriseUser("Bpharmae", "Bpharmae", pharmaEntemp2, new PharmaceuticalEnterpriseAdminRole());

        Employee medEqupEntEmp2 = new Employee();
        medEqupEntEmp2.setName("MEDICAL EQUIPMENTS ENTERPRISE ADMIN BOSTON");
        e1B.getEnterpriseUserAccountDirectory().createEnterpriseUser("Bmedicale", "Bmedicale", medEqupEntEmp2, new EquipmentEnterpriseRole());

        Employee labEntpEMp2 = new Employee();
        labEntpEMp.setName("LAB CENTER & DIAGNOSTICS ENTERPRISE ADMIN BOSTON");
        e2B.getEnterpriseUserAccountDirectory().createEnterpriseUser("Blabenterprise", "Blabenterprise", labEntpEMp2, new LabEnterprise());

        Employee vaccineEntAdmin2 = new Employee();
        vaccineEntAdmin2.setName("VACCINE AND IMMUNIZATION ENTERPRISE ADMIN BOSTON");
        e3B.getEnterpriseUserAccountDirectory().createEnterpriseUser("Bvaccineenterprise", "Bvaccineenterprise", vaccineEntAdmin2, new VaccinationEnterpriseRole());
        
        Employee bloodBankAdminCalifornia = new Employee();
bloodBankAdminCalifornia.setName("California Blood Bank Admin");
e4.getEnterpriseUserAccountDirectory().createEnterpriseUser(
    "CalBloodBankAdmin", // Username
    "CalBloodBankPass",  // Password
    bloodBankAdminCalifornia,
    new EnterpriseBloodbank() // Role for Blood Bank Admin
);

Employee bloodBankAdminBoston = new Employee();
bloodBankAdminBoston.setName("Boston Blood Bank Admin");
        UserAccount createEnterpriseUser1 = e4B.getEnterpriseUserAccountDirectory().createEnterpriseUser(
                "BosBloodBankAdmin", // Username
                "BosBloodBankPass",  // Password
                bloodBankAdminBoston,
                new EnterpriseBloodbank() // Role for Blood Bank Admin
        );
        
        
        // Add Blood Banks to California Blood Bank Enterprise// Add Blood Banks to California Blood Bank Enterprise
BloodBankDirectory californiaBloodBankDirectory = e4.getBloodBankDirectory();

// Create Blood Bank 1 in California
BloodBank californiaBloodBank1 = californiaBloodBankDirectory.addBloodBank("California Blood Bank 1", 
    "Los Angeles", 
    "A+", 
    100, 
    "123-456-7890", 
    "admin1",  // Username for admin
    "adminpass123"  // Password for admin
);

// Create Blood Bank 2 in California
BloodBank californiaBloodBank2 = californiaBloodBankDirectory.addBloodBank("California Blood Bank 2", 
    "San Francisco", 
    "O-", 
    50, 
    "987-654-3210", 
    "admin2",  // Username for admin
    "adminpass456"  // Password for admin
);

// Add Blood Banks to Boston Blood Bank Enterprise
BloodBankDirectory bostonBloodBankDirectory = e4B.getBloodBankDirectory();

// Create Blood Bank 1 in Boston
BloodBank bostonBloodBank1 = bostonBloodBankDirectory.addBloodBank("Boston Blood Bank 1", 
    "Boston", 
    "B+", 
    80, 
    "222-333-4444", 
    "admin3",  // Username for admin
    "adminpass789"  // Password for admin
);

// Create Harvard Blood Bank in Boston
BloodBank bostonBloodBank2 = bostonBloodBankDirectory.addBloodBank("Harvard Blood Bank", 
    "Cambridge", 
    "AB-", 
    60, 
    "555-666-7777", 
    "admin4",  // Username for admin
    "adminpass012"  // Password for admin
);


       



//        For Pharma enterprise
//        create delivery agents in enterprise
        ArrayList<DeliveryAgent> delList = e.getDeliveryAgentsInEnterpiselist();
        ArrayList<Integer> z1 = new ArrayList<>();
        ArrayList<Integer> z2 = new ArrayList<>();
        for (int j = 1; j < 5; j++) {
            DeliveryAgent d = new DeliveryAgent();
            z1.add(90010 + j);
//

            Employee em = new Employee();
            em.setName("Delivery Man" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliveryc" + String.valueOf(j));
            u.setPassword("deliveryc" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setUseraccount(u);
            d.setZipcodes(z1);
            d.setEnterprisename(e);
            delList.add(d);

        }
        e.setDeliveryAgentsInEnterpiselist(delList);
        ArrayList<DeliveryAgent> delList2 = eB.getDeliveryAgentsInEnterpiselist();
        for (int j = 1; j < 5; j++) {
            z2.add(02115 + j);
            DeliveryAgent d = new DeliveryAgent();

            Employee em = new Employee();
            em.setName("Delivery Man Boston" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliveryb" + String.valueOf(j));
            u.setPassword("deliveryb" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setZipcodes(z2);
            d.setEnterprisename(e);
            delList2.add(d);

        }
        eB.setDeliveryAgentsInEnterpiselist(delList2);

        // For Vaccine Enterprise
        //  create delivery agents in enterprise
        ArrayList<DeliveryAgent> delListV1 = e3.getDeliveryAgentsInEnterpiselist();
        ArrayList<Integer> z3 = new ArrayList<>();
        ArrayList<Integer> z4 = new ArrayList<>();
        for (int j = 1; j < 5; j++) {
            DeliveryAgent d = new DeliveryAgent();
            z3.add(90010 + j);
//

            Employee em = new Employee();
            em.setName("Delivery Man" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliverycv" + String.valueOf(j));
            u.setPassword("deliverycv" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setUseraccount(u);
            d.setZipcodes(z3);
            d.setEnterprisename(e3);
            delListV1.add(d);

        }
        e3.setDeliveryAgentsInEnterpiselist(delListV1);
        ArrayList<DeliveryAgent> delListV2 = e3B.getDeliveryAgentsInEnterpiselist();
        for (int j = 1; j < 5; j++) {
            DeliveryAgent d = new DeliveryAgent();
            z4.add(02115 + j);

            Employee em = new Employee();
            em.setName("Delivery Man Boston" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliverybv" + String.valueOf(j));
            u.setPassword("deliverybv" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setZipcodes(z4);
            d.setEnterprisename(e3B);
            delListV2.add(d);

        }
        e3B.setDeliveryAgentsInEnterpiselist(delListV2);
        
        
        



        // For Medical equipment Enterprise
        //  create delivery agents in enterprise
        ArrayList<DeliveryAgent> delListME1 = e1.getDeliveryAgentsInEnterpiselist();
        ArrayList<Integer> z5 = new ArrayList<>();
        ArrayList<Integer> z6 = new ArrayList<>();
        for (int j = 1; j < 5; j++) {
            DeliveryAgent d = new DeliveryAgent();
            z5.add(90010 + j);
//

            Employee em = new Employee();
            em.setName("Delivery Man" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliverycm" + String.valueOf(j));
            u.setPassword("deliverycm" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setUseraccount(u);
            d.setZipcodes(z5);
            d.setEnterprisename(e1);
            delListME1.add(d);

        }
        e1.setDeliveryAgentsInEnterpiselist(delListME1);
        ArrayList<DeliveryAgent> delListME2 = e1B.getDeliveryAgentsInEnterpiselist();
        for (int j = 1; j < 5; j++) {
            z6.add(02115 + j);
            DeliveryAgent d = new DeliveryAgent();

            Employee em = new Employee();
            em.setName("Delivery Man Boston" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliverybm" + String.valueOf(j));
            u.setPassword("deliverybm" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setZipcodes(z6);
            d.setEnterprisename(e1B);
            delListV2.add(d);

        }
        e1B.setDeliveryAgentsInEnterpiselist(delListME2);

        // For Lab Enterprise
        //  create delivery agents in enterprise
        ArrayList<DeliveryAgent> delListL1 = e2.getDeliveryAgentsInEnterpiselist();
        ArrayList<Integer> z7 = new ArrayList<>();
        ArrayList<Integer> z8 = new ArrayList<>();
        for (int j = 1; j < 5; j++) {
            DeliveryAgent d = new DeliveryAgent();
            z7.add(90010 + j);
//

            Employee em = new Employee();
            em.setName("Delivery Man" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliverycl" + String.valueOf(j));
            u.setPassword("deliverycl" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setUseraccount(u);
            d.setZipcodes(z7);
            d.setEnterprisename(e2);
            delListL1.add(d);

        }

        e2.setDeliveryAgentsInEnterpiselist(delListL1);

        ArrayList<DeliveryAgent> delListL2 = e2B.getDeliveryAgentsInEnterpiselist();
        for (int j = 1; j < 5; j++) {

            DeliveryAgent d = new DeliveryAgent();
            z8.add(02115 + j);

            Employee em = new Employee();
            em.setName("Delivery Man Boston" + String.valueOf(j));
            UserAccount u = d.getUseraccount();
            u.setUsername("deliverybl" + String.valueOf(j));
            u.setPassword("deliverybl" + String.valueOf(j));
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setZipcodes(z8);
            d.setEnterprisename(e2B);
            delListL2.add(d);

        }
        e2B.setDeliveryAgentsInEnterpiselist(delListL2);

//        create users on enterprise level
        OrganizationDirectory o = e.getOrganizationDirectory();
        OrganizationDirectory o1 = e1.getOrganizationDirectory();
        OrganizationDirectory o2 = e2.getOrganizationDirectory();
        OrganizationDirectory o3 = e3.getOrganizationDirectory();

        Organization orgP = o.createOrganization(Organization.Type.Doctor, "Doctor Associate", "California", 90011);
        Organization orgP1 = o.createOrganization(Organization.Type.Pharmacist, "Pharmacy", "California", 90011);
        Organization orgP2 = o.createOrganization(Organization.Type.MarketManager, "Supermarket", "California", 90011);

        Organization orgM = o1.createOrganization(Organization.Type.EquipmentManager, "Equipments", "California", 90011);

        Organization orgV = o3.createOrganization(Organization.Type.PharmaOrgAdmin, "Immunization", "California", 90011);

        Organization orgL = o2.createOrganization(Organization.Type.LabAssistant, "Lab Center", "California", 90011);
        Organization orgL1 = o2.createOrganization(Organization.Type.LabTester, "Sample Collection Center", "California", 90011);

        OrganizationDirectory oo = eB.getOrganizationDirectory();
        OrganizationDirectory oo1 = e1B.getOrganizationDirectory();
        OrganizationDirectory oo2 = e2B.getOrganizationDirectory();
        OrganizationDirectory oo3 = e3B.getOrganizationDirectory();

        Organization orgBP = oo.createOrganization(Organization.Type.Doctor, "Doctor Associate", "Boston", 02120);
        Organization orgBP1 = oo.createOrganization(Organization.Type.Pharmacist, "Pharmacy", "Boston", 02120);
        Organization orgBP2 = oo.createOrganization(Organization.Type.MarketManager, "Supermarket", "Boston", 02120);

        Organization orgMB = oo1.createOrganization(Organization.Type.EquipmentManager, "Equipments", "Boston", 02120);

        Organization orgVB = oo3.createOrganization(Organization.Type.PharmaOrgAdmin, "Immunization", "Boston", 02120);

        Organization orgLB = oo2.createOrganization(Organization.Type.LabAssistant, "Lab Center", "Boston", 02120);
        Organization orgLB1 = oo2.createOrganization(Organization.Type.LabTester, "Sample Collection Center", "Boston", 02120);

//        System.out.println("ORG LIST SIZE " + orgList.size());
//        ArrayList<Enterprise> eList = edir.getEnterpriseList();
//        edir.setEnterpriseList(eList);
        Employee emp = orgP.getEmployeeDirectory().createEmployee("California Doctor");
        Employee empB = orgBP.getEmployeeDirectory().createEmployee("Boston Doctor");

        orgP.getUserAccountDirectory().createUserAccount("caldoctor", "caldoctor", emp, new DoctorRole());
        orgBP.getUserAccountDirectory().createUserAccount("bostondoctor", "bostondoctor", empB, new DoctorRole());

        Employee emp1 = orgP1.getEmployeeDirectory().createEmployee("California Pharmacist");
        Employee emp1B = orgBP1.getEmployeeDirectory().createEmployee("Boston Pharmacist");
        orgP1.getUserAccountDirectory().createUserAccount("calpharmacist", "calpharmacist", emp1, new PharmacistRole());
        orgBP1.getUserAccountDirectory().createUserAccount("bostonpharmacist", "bostonpharmacist", emp1B, new PharmacistRole());

        Employee emp2 = orgP2.getEmployeeDirectory().createEmployee("California Supermarket");
        Employee emp2B = orgBP2.getEmployeeDirectory().createEmployee("Boston Supermarket");
        orgP2.getUserAccountDirectory().createUserAccount("calsupermarket", "calsupermarket", emp2, new MarketManagerRole());
        orgBP2.getUserAccountDirectory().createUserAccount("bostonsupermarket", "bostonsupermarket", emp2B, new MarketManagerRole());

        Employee empM = orgM.getEmployeeDirectory().createEmployee("California Medical Equipment");
        Employee empMB = orgMB.getEmployeeDirectory().createEmployee("Boston Medical Equipment");
        orgM.getUserAccountDirectory().createUserAccount("calmedical", "calmedical", empM, new EquipmentProviderRole());
        orgMB.getUserAccountDirectory().createUserAccount("bostonmedical", "bostonmedical", empMB, new EquipmentProviderRole());

        Employee empV = orgV.getEmployeeDirectory().createEmployee("California Immunizer");
        Employee empVB = orgVB.getEmployeeDirectory().createEmployee("Boston Immunizer");
        orgV.getUserAccountDirectory().createUserAccount("calvaccine", "calvaccine", empV, new VaccinatorRole());
        orgVB.getUserAccountDirectory().createUserAccount("bostonvaccine", "bostonvaccine", empVB, new VaccinatorRole());

        Employee empL = orgL.getEmployeeDirectory().createEmployee("California Lab Center");
        Employee empLB = orgLB.getEmployeeDirectory().createEmployee("Boston Lab Center");
        orgL.getUserAccountDirectory().createUserAccount("callab", "callab", empL, new LabAssistantRole());
        orgLB.getUserAccountDirectory().createUserAccount("bostonlab", "bostonlab", empLB, new LabAssistantRole());

        Employee empL1 = orgL1.getEmployeeDirectory().createEmployee("California Lab Center");
        Employee empLB1 = orgLB1.getEmployeeDirectory().createEmployee("Boston Lab Center");
        orgL1.getUserAccountDirectory().createUserAccount("calsample", "calsample", empL1, new LabTesterRole());
        orgLB1.getUserAccountDirectory().createUserAccount("bostonsample", "bostonsample", empLB1, new LabTesterRole());

        String[] drugs = {"Brufen", "Paracetamol", "Pan D", "Crocin", "Atrovastin", "Lisinopril", "Amlodipine"};
        for (String s1 : drugs) {
            orgP1.addProduct(s1, 7.5, 500);
            orgBP1.addProduct(s1, 8.0, 1000);
        }
        String[] sup = {"Brufen", "Paracetamol", "Pan D", "Crocin"};
        for (String s1 : sup) {
            orgP2.addProduct(s1, 6.5, 1500);
            orgBP2.addProduct(s1, 7.45, 3500);
        }

//        create orgs under Vaccine enterprise
        String[] vaccineProducts = {"Moderna", "J&J", "Hepatitis B", "Pfizer", "Meningococcal"};
        for (String s : vaccineProducts) {
            orgV.addProduct(s, 10.0, 200);
            orgVB.addProduct(s, 12.0, 2100);

        }

        String[] Medicalequipments = {"Medical Thermometer", "Insulin pumps", "Breast pumps", "Oximeter", "Portable oxygen cylinder"};
        for (String s : Medicalequipments) {
            orgM.addProduct(s, 10.0, 2000);
            orgMB.addProduct(s, 15.0, 3100);

        }

        String[] tests = {"Blood", "Haemoglobin", "Hepatitis B", "Measles", "Meningococcal", "Urine"};
        for (String s : tests) {
            orgL1.addProduct(s, 10.0, 200);
            orgLB1.addProduct(s, 12.0, 2100);

        }

        n.setEnterpriseDirectory(edir);
        n2.setEnterpriseDirectory(edir2);

        for (Network net : system.getNetworks()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println(ent.getEnterpriseType());
                System.out.println(ent.getOrganizationDirectory().getOrganizationList().size());

                for (Organization or : ent.getOrganizationDirectory().getOrganizationList()) {
                    System.out.println(or.getName() + " *** ");

                }

            }
        }

        return system;
    }
}

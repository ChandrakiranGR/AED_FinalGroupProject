/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
//import Business.Orders.Order;
import Business.Products.Product;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.PrescriptionUploadWorkRequest;
import Business.WorkQueue.ReportUploadWorkRequest;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author chandrakiran
 */
public abstract class Organization {

    private String name;
    private String location;
    private int zipcode;
    private int organizationID;

//    directories
//    organization has products
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ArrayList<Product> productList;

//    WorkRequest Arraylist 
    private ArrayList<PrescriptionUploadWorkRequest> prescriptionWorkList;
    private ArrayList<ReportUploadWorkRequest> reportWorkList;
            
            
    public enum Type {
        Admin("Organization Administrator"),
        Doctor("Doctor"),
        PharmaOrgAdmin("Pharma Vaccine Administrator"),
        Prescriber("Prescriber"),
        Pharmacist("Pharmacist"),
        EquipmentManager("Equipment Manager"),
        MarketManager("Supermarket Manager"),
        LabAssistant("Lab Assistant"),
        LabTester("Lab Tester"),
        DeliveryAgent("Delivery Agent");
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String type, String name, String location, int zipcode) {
        this.name = name;
        this.location = location;
        this.zipcode = zipcode;
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.organizationID = randomIdGenerator();
        this.productList = new ArrayList<Product>();
        this.prescriptionWorkList = new ArrayList<PrescriptionUploadWorkRequest>();
        this.reportWorkList = new ArrayList<ReportUploadWorkRequest>();
    }

    public int randomIdGenerator() {
        Random rand = new Random(System.currentTimeMillis());
        return (((10 + rand.nextInt(2)) * 100 + rand.nextInt(1000)));
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public ArrayList<Product> getOrganizationProducts() {
        return this.productList;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public ArrayList<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    
    public void addProduct(String name, Double price, int stock) {
        Product prod = new Product();
        prod.setName(name);
        prod.setPrice(price);
        prod.setStockunits(stock);
        this.productList.add(prod);
    }
    
    public Product fetchProduct(int id) {
        for(Product p: this.productList) {
            if(p.getProductId() == id) {
                return p;
            }
        } 
        return null;
    }

    public ArrayList<PrescriptionUploadWorkRequest> getPrescriptionWorkList() {
        return prescriptionWorkList;
    }

    public void setPrescriptionWorkList(ArrayList<PrescriptionUploadWorkRequest> prescriptionWorkList) {
        this.prescriptionWorkList = prescriptionWorkList;
    }

    public ArrayList<ReportUploadWorkRequest> getReportWorkList() {
        return reportWorkList;
    }

    public void setReportWorkList(ArrayList<ReportUploadWorkRequest> reportWorkList) {
        this.reportWorkList = reportWorkList;
    }
    
    
}

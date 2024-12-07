/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
/**
 *
 * @author chandrkiran
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return this.organizationList;
    }
    
    public Organization createOrganization(Type type, String name, String location, int zipcode) {
        Organization organization = null;
        
//        Create the organizations based on the type recieved.
        if(type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorAssociationOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.PharmaOrgAdmin.getValue())) {
            organization = new PharmaOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.Pharmacist.getValue())) {
            organization = new PharmacyOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.DeliveryAgent.getValue())) {
            organization = new DeliveryOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.EquipmentManager.getValue())) {
            organization = new EquipmentProvidersOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.LabTester.getValue())) {
            organization = new SampleCollectionTestingOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.LabAssistant.getValue())) {
            organization = new LabCenterOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.Prescriber.getValue())) {
            organization = new DoctorAssociationOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.MarketManager.getValue())) {
            organization = new SupermarketOrganization(name, location, zipcode);
            this.organizationList.add(organization);
        }
        
        return organization;
    }
    
    public Organization getOrganizationByName(String name) {
        for(Organization o: organizationList) {
            if(o.getName().equalsIgnoreCase(name)) {
                return o;
            }
        }
        return null;
    }
}

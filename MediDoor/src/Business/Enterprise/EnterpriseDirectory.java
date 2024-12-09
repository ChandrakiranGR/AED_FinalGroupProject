package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivanisugurushetty
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriselist;
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return this.enterpriselist;
    }
    
    public void setEnterpriseList(ArrayList<Enterprise> enterpriselist) {
        this.enterpriselist = enterpriselist;
    }
    
    public EnterpriseDirectory() {
        this.enterpriselist = new ArrayList<Enterprise>();
    }
    
    public Enterprise createEnterprise(EnterpriseType type, String name, String location) {
        Enterprise enterprise = null;
        if(type == EnterpriseType.Pharmaceutical) {
            enterprise = new PharmaceuticalEnterpise(name, location);
            this.enterpriselist.add(enterprise);
        }
        
        if(type == EnterpriseType.Vaccination) {
            enterprise = new ImmunizationEnterprise(name, location);
            this.enterpriselist.add(enterprise);
        }
        
        if(type == EnterpriseType.MedicalEquipements) {
            enterprise = new MedicalEquipments(name, location);
            this.enterpriselist.add(enterprise);
        }
        
        if(type == EnterpriseType.LabDiagnostics) {
            enterprise = new LabOrgDiagnosticsEnterprise(name, location);
            this.enterpriselist.add(enterprise);
        }
        
        return enterprise;
    }

    
    public Enterprise getEnterprise(String name){
        for(Enterprise e : this.enterpriselist){
            if(e.getName().equalsIgnoreCase(name)){
                return e;
            }
        }
        return null;
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriselist.remove(e);
    }
            
}

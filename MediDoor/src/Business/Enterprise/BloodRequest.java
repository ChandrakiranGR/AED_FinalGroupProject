/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author chandrkiran
 */
public class BloodRequest {
    private int requestId;
    private String customerName;
    private String bloodGroup;
    private String location; // "California" or "Boston"
    private String status;   // "Pending", "Accepted", or "Rejected"

    public BloodRequest(int requestId, String customerName, String bloodGroup, String location) {
        this.requestId = requestId;
        this.customerName = customerName;
        this.bloodGroup = bloodGroup;
        this.location = location;
        this.status = "Pending"; // Default status
    }

    // Getters and Setters for encapsulation
    public int getRequestId() {
        return requestId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

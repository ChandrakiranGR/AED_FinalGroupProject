/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author antaradeshmukh
 */
public class BloodRequestWorkRequest {
   private String requestId;
    private String bloodType;
    private String status;
    private String date;

    // Constructor
   public BloodRequestWorkRequest(String bloodType, String requestId1, String pending, String requestDate) {
    this.bloodType = bloodType;
    this.status = "Pending"; // Default status
    this.date = new Date().toString(); // Set current date as the request date
    generateRequestId(); // Automatically generate request ID
}
    
     public BloodRequestWorkRequest(String bloodType, String status, String pending, Date date) {
        this.requestId = String.valueOf(requestId); // Convert int to String
        this.bloodType = bloodType;
        this.status = status;
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(date); // Convert Date to String
    }

     // In the parent container or main class
private List<BloodRequestWorkRequest> requestList = new ArrayList<>();

// Getter for requestList
public List<BloodRequestWorkRequest> getRequestList() {
    return requestList;
}

// Setter for requestList (if needed)
public void setRequestList(List<BloodRequestWorkRequest> requestList) {
    this.requestList = requestList;
}

    // Generate a random unique request ID (similar to the WorkRequest ID generation)
    public static String generateRequestId() {
    // Logic to generate request ID
    return "REQ-" + UUID.randomUUID().toString(); // Example logic
}

    // Getter and Setter Methods
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Override toString to display request details easily
    @Override
    public String toString() {
        return "Request ID: " + requestId + ", Blood Type: " + bloodType + ", Status: " + status + ", Date: " + date;
    }
}

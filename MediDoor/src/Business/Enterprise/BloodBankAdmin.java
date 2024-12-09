/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chandrkiran
 */
public class BloodBankAdmin {
     private int id;
    private String name;
    private String location;

    public BloodBankAdmin(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Blood Bank ID: " + id + ", Name: " + name + ", Location: " + location;
    }
}

// Class representing the admin who manages requests and blood banks
class Admin {
    private List<BloodRequest> requests;
    private List<BloodBank> bloodBanks;

    public Admin() {
        this.requests = new ArrayList<>();
        this.bloodBanks = new ArrayList<>();
        loadDummyData();
    }

    // Method to load dummy data
    private void loadDummyData() {
        // Dummy blood requests
        requests.add(new BloodRequest(1, "Alice", "A+", "California"));
        requests.add(new BloodRequest(2, "Bob", "B+", "Boston"));

        // Dummy blood banks
        bloodBanks.add(new BloodBank(1, "Central Blood Bank", "California"));
        bloodBanks.add(new BloodBank(2, "Boston Blood Bank", "Boston"));
    }

    // Manage Requests
    public List<BloodRequest> getRequests() {
        return requests;
    }

    public boolean processRequest(int requestId, String action) {
        for (BloodRequest request : requests) {
            if (request.getRequestId() == requestId) {
                if ("accept".equalsIgnoreCase(action)) {
                    request.setStatus("Accepted");
                } else if ("reject".equalsIgnoreCase(action)) {
                    request.setStatus("Rejected");
                } else {
                    return false; // Invalid action
                }
                return true; // Successfully processed
            }
        }
        return false; // Request not found
    }

    // Manage Blood Banks
    public List<BloodBank> getBloodBanks() {
        return bloodBanks;
    }

    public void addBloodBank(String name, String location) {
        int newId = bloodBanks.size() + 1;
        bloodBanks.add(new BloodBank(newId, name, location));
        System.out.println("Blood Bank added successfully.");
    }

    public boolean deleteBloodBank(int id) {
        return bloodBanks.removeIf(bank -> bank.getId() == id);
    } 
}

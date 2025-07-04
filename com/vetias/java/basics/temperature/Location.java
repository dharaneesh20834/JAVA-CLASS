public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String address;
    private String postalCode;
    private String contact;

    
    

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    
    public String getPostalCode() {
        return postalCode;
    }

    public String getContact() {
        return contact;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
     @Override
    public String toString() {      
        return "Location{" +
                "name='" + name +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + 
                ", postalCode='" + postalCode + 
                ", contact='" + contact + 
                '}';
    
}
}


package task2;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;


    public void setAddress1(String address) {
        String[] partsOfAddress = getAddressDefault(address);
        this.country = partsOfAddress[0];
        this.region = partsOfAddress[1];
        this.city = partsOfAddress[2];
        this.street = partsOfAddress[3];
        this.house = partsOfAddress[4];
        this.building = partsOfAddress[5];
        this.flat = partsOfAddress[6];
    }

    public void setAddress2(String address) {
        StringTokenizer tokenizer = getAddressSeparator(address);
        int i = 0;
        String[] partsOfAddress = new String[7];
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            partsOfAddress[i] = token;
            i++;
        }
        this.country = partsOfAddress[0];
        this.region = partsOfAddress[1];
        this.city = partsOfAddress[2];
        this.street = partsOfAddress[3];
        this.house = partsOfAddress[4];
        this.building = partsOfAddress[5];
        this.flat = partsOfAddress[6];
    }

    public String[] getAddressDefault(String address) {
        return address.split(",");
    }

    public StringTokenizer getAddressSeparator(String address) {
        return new StringTokenizer(address, ",.;");
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}

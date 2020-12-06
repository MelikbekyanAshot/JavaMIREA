package task4;

public class TelephoneNumber {
    private String countryCode;
    private String firstTriad;
    private String secondTriad;
    private String foursome;

    public TelephoneNumber(String telephoneNumber) {
        if (telephoneNumber.startsWith("+")) {
            char[] charArray = telephoneNumber.toCharArray();
            foursome = (charArray[telephoneNumber.length() - 4] + "") + (charArray[telephoneNumber.length() - 3] + "") +
                    (charArray[telephoneNumber.length() - 2] + "") + (charArray[telephoneNumber.length() - 1] + "");
            secondTriad = (charArray[telephoneNumber.length() - 7] + "") + (charArray[telephoneNumber.length() - 6] + "")
                    + (charArray[telephoneNumber.length() - 5] + "");
            firstTriad = (charArray[telephoneNumber.length() - 10] + "") + (charArray[telephoneNumber.length() - 9] + "") +
                    (charArray[telephoneNumber.length() - 8] + "");
            countryCode = telephoneNumber.substring(0, telephoneNumber.length()-10);
        } else if (telephoneNumber.startsWith("8")) {
            char[] charArray = telephoneNumber.toCharArray();
            foursome = (charArray[telephoneNumber.length() - 4] + "") + (charArray[telephoneNumber.length() - 3] + "") +
                    (charArray[telephoneNumber.length() - 2] + "") + (charArray[telephoneNumber.length() - 1] + "");
            secondTriad = (charArray[telephoneNumber.length() - 7] + "") + (charArray[telephoneNumber.length() - 6] + "")
                    + (charArray[telephoneNumber.length() - 5] + "");
            firstTriad = (charArray[telephoneNumber.length() - 10] + "") + (charArray[telephoneNumber.length() - 9] + "") +
                    (charArray[telephoneNumber.length() - 8] + "");
            countryCode = "+7";
        }
    }

    @Override
    public String toString() {
        return "TelephoneNumber{" +
                "countryCode=" + countryCode +
                ", firstTriad=" + firstTriad +
                ", secondTriad=" + secondTriad +
                ", foursome=" + foursome +
                '}';
    }
}

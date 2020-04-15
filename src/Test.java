public class Test {
    private static final String[] valid = {"(84)-(0978489648)", "(86)-(06435256)"};
    private static final String[] invalid = {"(a4)-(22222222)", "(86)-(a5533556)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        boolean isValid;
        for (String phoneNumber1 : valid){
            isValid = phoneNumber.isPhoneNumber(phoneNumber1);
            System.out.println("Phone number: "+phoneNumber1+" is valid: "+isValid);
        }
        for (String phoneNumber1 : invalid){
            isValid = phoneNumber.isPhoneNumber(phoneNumber1);
            System.out.println("Phone number: "+phoneNumber1+" is valid: "+isValid);
        }
    }
}

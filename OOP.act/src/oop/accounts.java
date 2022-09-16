
package oop;


public class accounts {
    private String emailUsername;
    private String emailAddress;

      public String getemailUsername() {
        return emailUsername;
    }

    public String getemailAddress() {
        return emailAddress;
    }
        public void setemailUsername(String newValue) {
        emailUsername= newValue;
    }

    public void setemailAddress(String newValue) {
        emailAddress = newValue;
    }

}
